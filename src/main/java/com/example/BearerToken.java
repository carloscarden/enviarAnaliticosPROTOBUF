package com.example;

import io.grpc.CallCredentials;
import io.grpc.Metadata;
import io.grpc.Status;

import java.util.concurrent.Executor;


public class BearerToken extends CallCredentials{

    private String value;

    BearerToken(String value) {
        this.value = value;
    }


    @Override
    public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
        executor.execute(() -> {
            try {
                Metadata headers = new Metadata();
                headers.put(Constants.AUTHORIZATION_METADATA_KEY, 
                            String.format("%s%s", Constants.BEARER_TYPE, value));
                
                headers.put(Constants.TOTAL,"100");
                metadataApplier.apply(headers);
            } catch (Throwable e) {
                metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
            }
        });
        // throw new UnsupportedOperationException("Unimplemented method 'applyRequestMetadata'");
    }
    
}
