package com.example;

import io.grpc.Metadata;

public class Constants {
    public static final String JWT_SIGNING_KEY = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIyIiwianRpIjoiZTI5MWM1ZDc0NWZhMzkyMDkyNzIyZmYwMjMwMmQxYjQ3MTA5ZDczOTI2OTg2Y2E4ODQ3ZjBlNTA4NmE4Yjc3M2U4Y2U2NThmYmZmZjM5Y2MiLCJpYXQiOjE2OTEwODY1NDQsIm5iZiI6MTY5MTA4NjU0NCwiZXhwIjoxNjkxMDkwMTQ0LCJzdWIiOiIzMzY1MjI4My1iZTNlLTQ4MzItOTc2ZC0yYmE4OWQ4NTc2ZGUiLCJzY29wZXMiOltdLCJwcm92aW5jaWFfaWQiOjF9.GNAFmkrnlMpYNHf67vG7rIaH5k61Ec_Q5B2_2TSXrR8SPrzpB5XXIXMyxYR5Ecn7FFzoaLcJA5QdebjsuOAG2qQX5Lm6BCOqXSahd_aly1v1opFvuvVmSTuTltXvnUbRvJBgnlW54x96CYvSsPZqwA-hDrX_8RNZzJBcY1CQEP4xDH_MAhTQgzBO0jNCWnO48bDev_mWHIf07hQLtnekAr0bPGoHSqHQCXqNgQl6IR4JfUzizICiKLyC5Rd3FlanJvoncuuhQBeLjte4T9ROQHcL4T4aSMWsbwkiu3qCTKAN33qefe-ugCzIfVUxWaxpx-00Ze-Kgc1oAGoXjFvBxTZz545fCISYk-jAQVYPwDrwhKZ5VLPjlElWfnBkDRrFPV-_1gDmpoYqekHmQ_krxXJtNGLzwlz0j-iSc_gIQZRhCBop-ugfQ-yrtqV9WIuj-10Es-jEwbWMSwHa3aPuL-0MAnWAvMl2G_PD2pGRWWZX5pj2t_eZxLZJrf9YMXEEhTfPWnM3xDg03BOoX7gq5tOfIWGa4lP8_D-Lb7tAyDZh0p8Si6RQJhqs_XzhYWbvFG2V9Q93Ss9Ymd2ZBU76vrp2YOwsej_D5BxxhbtlJtKsDCLK0IB7O_ejAsAyOWmjYyDIKdg8gvSLCDgBc3UvZykOjYybqsjEgixtNLJevMA";
    public static final String BEARER_TYPE = "";

    public static final String HOST = "titulos-app-stg.educacion.gob.ar";

    public static final Metadata.Key<String> AUTHORIZATION_METADATA_KEY = 
                Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);


    public static final Metadata.Key<String> TOTAL = 
                Metadata.Key.of("total", Metadata.ASCII_STRING_MARSHALLER);

    private Constants() {
        throw new AssertionError();
    }

}
