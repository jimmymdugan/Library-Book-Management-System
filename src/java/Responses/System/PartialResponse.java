package Responses.System;

import Responses.LibraryResponse;

/**
 * The client sends a partial request (i.e. any request not terminated by a semi-colon).
 *
 * @author Henry Larson
 */
public class PartialResponse extends LibraryResponse {
    private String partial;

    public PartialResponse(String partial) {
        this.partial = partial;
    }

    public String getPartial() {
        return partial;
    }

    public String toString() {
        return partial;
    }
}
