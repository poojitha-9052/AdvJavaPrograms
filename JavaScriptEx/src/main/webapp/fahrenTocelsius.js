function convertToCelsius()
{
	//read fahrenheit input storec in variable
	const fahrenheitInput=document.getElementById('fahrenheitInput').value;
	
	// convert the fahrenheit input to celsius
	const cesiusTemparature=(parseFloat(fahrenheitInput)-32)*5/9;
	
	//set the output to celsiusOutput field
	document.getElementById('celsiusOutput').value=cesiusTemparature.toFixed(2);
}