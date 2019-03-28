package Requests.Visitor;

import Responses.LibraryResponse;
import Responses.Visitor.EndVisitResponse;

/**
 * Ends a visit in progress.
 *
 * @author Henry Larson
 */
public class EndVisitRequest extends VisitRequest {
    public EndVisitRequest(String visitorID) {
        super(visitorID);
    }

    public String getVisitorID() {
        return super.getVisitorID();
    }

    @Override
    // TODO - Create method call for response data
    public LibraryResponse execute() {
        return new EndVisitResponse("", null, null);
    }
}
