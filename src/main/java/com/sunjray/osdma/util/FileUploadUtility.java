package com.sunjray.osdma.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.sunjray.osdma.constants.AWSConstants;

@Service
public class FileUploadUtility {
	@Autowired
	private AmazonS3 s3client;

	public String uploadFileToS3(String fileName, String productImage, String path) {
		String imagePath = "";
		String bucketName = AWSConstants.AWS_BUCKET_NAME;
		s3client.putObject(
				new PutObjectRequest(bucketName, fileName, CommonUtil.convertBS64ImgToFile(productImage, path))
						.withCannedAcl(CannedAccessControlList.PublicRead));
		imagePath = AWSConstants.AWS_DEFAULT_URL + bucketName + "/" + fileName;
		return imagePath;
	}

}
