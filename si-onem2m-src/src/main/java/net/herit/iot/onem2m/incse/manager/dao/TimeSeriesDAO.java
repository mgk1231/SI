package net.herit.iot.onem2m.incse.manager.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.herit.iot.message.onem2m.OneM2mRequest.RESULT_CONT;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.convertor.ConvertorFactory;
import net.herit.iot.onem2m.core.convertor.DaoJSONConvertor;
import net.herit.iot.onem2m.core.util.OneM2MException;
import net.herit.iot.onem2m.incse.context.OneM2mContext;
import net.herit.iot.onem2m.incse.facility.OneM2mUtil;
import net.herit.iot.onem2m.resource.Container;
import net.herit.iot.onem2m.resource.Resource;
import net.herit.iot.onem2m.resource.TimeSeries;

public class TimeSeriesDAO extends ResourceDAO implements DAOInterface {

	private Logger log = LoggerFactory.getLogger(TimeSeriesDAO.class);

	public TimeSeriesDAO(OneM2mContext context) {
		super(context);
	}
	
	@Override
	public String resourceToJson(Resource res) throws OneM2MException {
		try {
			
			DaoJSONConvertor<TimeSeries> jc = (DaoJSONConvertor<TimeSeries>)ConvertorFactory.getDaoJSONConvertor(TimeSeries.class, TimeSeries.SCHEMA_LOCATION);
			return jc.marshal((TimeSeries)res);
			
		} catch (Exception e) {
			log.debug("Handled exception", e);
			throw new OneM2MException(RESPONSE_STATUS.INTERNAL_SERVER_ERROR, "Json generation error:"+res.toString());
		}
	}
	
	@Override
	public void create(Resource resource) throws OneM2MException {

		((TimeSeries)resource).setCurrentNrOfInstances(0);
		((TimeSeries)resource).setCurrentByteSize(0);
		((TimeSeries)resource).setStateTag(0);
		
		super.create(resource);
	}
	
	@Override
	public void update(Resource resource) throws OneM2MException {

		((TimeSeries)resource).setStateTag(((TimeSeries)resource).getStateTag() + 1);
		
		super.update(resource);			
	}
	
	@Override
	public void delete(String id) throws OneM2MException {
		String resourceID = (String)this.getAttribute(OneM2mUtil.isUri(id) ? URI_KEY : RESID_KEY,  id, RESID_KEY);	

		deleteChild(resourceID);
		
		deleteDocument(OneM2mUtil.isUri(id) ? URI_KEY : RESID_KEY, id);

	}

	@Override
	public Resource retrieve(String id, RESULT_CONT rc) throws OneM2MException {
		
		return retrieve(OneM2mUtil.isUri(id) ? URI_KEY : RESID_KEY, id, 
				(DaoJSONConvertor<TimeSeries>)ConvertorFactory.getDaoJSONConvertor(TimeSeries.class, TimeSeries.SCHEMA_LOCATION), rc);
	}

}
