package org.nmfw.foodietree.global.service;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.s3.S3Client;

@Service
@Slf4j
public class AwsS3Service {
    // s3 버킷을 인증받는 객체
    private S3Client s3;

    //인증정보
    @Value("${aws.credentials.accessKey}")
    private String accessKey;
    @Value("${aws.credentials.secretKey}")
    private String secretKey;
    @Value("${aws.region}")
    private String region;
    @Value("${aws.bucketName}")
    private String bucketName;


}
