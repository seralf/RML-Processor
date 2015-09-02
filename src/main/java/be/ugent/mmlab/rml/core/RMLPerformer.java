package be.ugent.mmlab.rml.core;

import be.ugent.mmlab.rml.model.TriplesMap;
import be.ugent.mmlab.rml.sesame.RMLSesameDataSet;
import org.openrdf.model.Resource;

/**
 * RML Processor
 *
 * Interface for executing context-dependent operations like a regular object map, or a join
 * 
 * @author mielvandersande, andimou
 */
public interface RMLPerformer {
    /**
     * Perform the action
     * 
     * @param node current object in the iteration
     * @param dataset dataset for endresult
     * @param map current triple map that is being processed
     */
    public void perform(Object node, RMLSesameDataSet dataset, 
            TriplesMap map, boolean pomExecution);
    
    /**
     *
     * @param node
     * @param dataset
     * @param map
     * @param subject
     */
    public void perform(Object node, RMLSesameDataSet dataset, 
            TriplesMap map, Resource subject);
}
