function convertToINR()
{
	//read fahrenheit input storec in variable
	const dollarInput=document.getElementById('dollarInput').value;
	
	// convert the fahrenheit input to celsius
	const InrValue=(parseFloat(dollarInput)*82.89);
	
	//set the output to celsiusOutput field
	document.getElementById('InrOutput').value=InrValue.toFixed(2);
}