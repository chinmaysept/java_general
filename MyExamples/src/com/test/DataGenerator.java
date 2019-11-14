package com.test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class DataGenerator {
	
	String DIV_NO ="    ";
	BigInteger STORE_NO;//="00001";
	String ACCT_NO="0";
	BigInteger PRIMARY_ACCT_NO;//="000000000000000001";
	String TRAN_AMT="$00100.00";
	String SWIPE_IND ="N";
	String SERIES=" ";
	String EXPIRE_MM="01";
	String EXPIRE_CCYY="2016";
	String AUTH_TYPE="S";
	String SOURCE_CODE="NTWK";
	String DECISION_to_Authcode ="OOOOOOOOOOOOOOOOOOO";
	String NET_AMT="$00100.00";
	String DOWN_PMT_to_Bal="OOOOOOOOOOOOOOOOOOOOOOOOOOOO";
	String AVS_5DIGIT_ZIP_to_address="906066252104 NATURE LN STREET";
	String MATCH_NUMBER="OOOOOO";
	BigInteger PURCHASE_ORDER;// ="22222222222222222222";
	BigInteger INVOICE_NO;//="00000000001000000000";
	String TRAN_DATE_time="160120040655";
	String CVC2_CD_to_data_type="0PLYPL1420";
	BigInteger Stan_no; //= "100000";
	String unsettled_amt_to_filler="$00000.001100   ";
	
	BigInteger one = new BigInteger("1");

	String FileName;

	BufferedReader in = null;
	StringBuffer sbf2 = new StringBuffer("Data Records\n");


	DataGenerator(BigInteger STORE_NO,BigInteger PRIMARY_ACCT_NO,BigInteger PURCHASE_ORDER,BigInteger INVOICE_NO,BigInteger Stan_no,String Filename) throws Exception
	{
		
		this.STORE_NO = STORE_NO;
		this.PRIMARY_ACCT_NO = PRIMARY_ACCT_NO;
		this.PURCHASE_ORDER = PURCHASE_ORDER;
		this.INVOICE_NO = INVOICE_NO;
		this.Stan_no = Stan_no;
		this.FileName=Filename;
		AutoDigitalFileCreator();
	}
	

	public void AutoDigitalFileCreator() throws Exception
	{

		Write_to_File();
		//QueryGen();
		System.out.println("Successfully created DigitalFile & it's Query");
			
	}
	
	
	public BigInteger Incremnt_PRIMARY_ACCT_NO()
	{
		
		PRIMARY_ACCT_NO =PRIMARY_ACCT_NO.add(one);
	return PRIMARY_ACCT_NO;

	}
	public BigInteger Incremnt_STORE_NO()
	{
		
		STORE_NO =STORE_NO.add(one);
	return STORE_NO;

	}
	public BigInteger Incremnt_PURCHASE_ORDER()
	{
		
		PURCHASE_ORDER =PURCHASE_ORDER.add(one);
	return PURCHASE_ORDER;

	}
	public BigInteger Incremnt_INVOICE_NO()
	{
		
		INVOICE_NO =INVOICE_NO.add(one);
	return INVOICE_NO;

	}
	public BigInteger Incremnt_Stan_no()
	{
		
		Stan_no =Stan_no.add(one);
	return Stan_no;

	}


	
	public void Write_to_File(){
		try{
			for(int i=0;i<3;i++){
				sbf2.append(sbf2.append(DIV_NO+STORE_NO+ACCT_NO+PRIMARY_ACCT_NO+TRAN_AMT+SWIPE_IND+SERIES+EXPIRE_MM+EXPIRE_CCYY+
						AUTH_TYPE+SOURCE_CODE+DECISION_to_Authcode+NET_AMT+DOWN_PMT_to_Bal+AVS_5DIGIT_ZIP_to_address+MATCH_NUMBER+
						PURCHASE_ORDER+INVOICE_NO+TRAN_DATE_time+CVC2_CD_to_data_type+Stan_no+unsettled_amt_to_filler));
				sbf2.append("\n");
			}
			String Filename3 ="D:\\chinu\\"+FileName;
			File file = new File(Filename3);
			FileWriter fw = new FileWriter(file);
			fw.write(sbf2.toString());
			fw.close();

	}
		catch(IOException e1){
			System.out.println("Error during reading/writing");
			}
	}


	
public static void main(String[] args) throws Exception {
		
		new DataGenerator(new BigInteger("00001"),new BigInteger("000000000000000001"),new BigInteger("22222222222222222222"),new BigInteger("00000000001000000000"),new BigInteger("100000"),"ADS_INPUT_FILE_11242015");
		
		
		
	  
	}
	






}
