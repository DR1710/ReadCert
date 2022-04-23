package demo;

import java.security.KeyStoreException;

import demo.util.CertificateDetails;
import demo.util.CertificateUtil;

public class TestMain {

	public static void main(String[] args) {

		CertificateDetails certDetails;
		try {
			certDetails = CertificateUtil.getCertificateDetails("/Users/s/keystore.jks", "password");
			System.out.println(certDetails.getPrivateKey());
			System.out.println("==========================");
			System.out.println(certDetails.getX509Certificate());

		} catch (KeyStoreException e) {
			e.printStackTrace();
		}
	}

}
