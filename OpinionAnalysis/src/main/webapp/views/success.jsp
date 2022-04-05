<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Analysis Results</title>
<style>

*
{
  margin:0;
  padding:0;
  font-family:'Roboto',sans-serif;
}
body
{
  background:#ffc2c2;
  /* background:#e8f5ca; */
  align-items:center;
  justify-content:center;
  min-height:100vh;
  display:flex;
}

.boxMain {
  display: flex;
  justify-content: space-between;
}

.box
{
  /* background:#fff; */
  background:#f20404;
  width:300px;
  height:400px;
  display:flex;
  justify-content:center;
  align-items:center;
  position:relative;
  flex-direction:column;
  box-shadow:0 30px 60px rgba(0,0,0,.4);
  transition: transform .2s;
}

.box .percent
{
  width:150px;
  height:150px;
  position:relative;
}
.box .percent svg
{
  width:150px;
  height:150px;
  position:relative;
}
.box .percent svg circle
{
  width:150px;
  height:150px;
  fill:none;
  stroke-width:10;
  stroke:#000;
  transform:translate(5px,5px);
  stroke-dasharray:440;
  stroke-dashoffset:440;
  stroke-linecap:round;
}
.box .percent svg circle:nth-child(1)
{
  stroke-dashoffset:0;
  stroke:#f3f3f3;
}

/* .box .percent svg circle:nth-child(2)
{
	stroke-dashoffset:calc(440 - (440 * ${Positive_Percentage }) / 100);	
  /* stroke-dashoffset:calc(440 - (440 * 12) / 100); */
  stroke:#ff6600;

}
 */
 
  .custom svg circle:nth-child(2)
 {
	/* stroke-dashoffset:calc(440 - (440 * ${Positive_Percentage }) / 100); */	
  /* stroke-dashoffset:calc(440 - (440 * 12) / 100); */
/*   stroke:#ff6600; */
}
 
 .custom0 svg circle:nth-child(2)
 {
	stroke-dashoffset:calc(440 - (440 * ${Positive_Percentage }) / 100);	
  /* stroke-dashoffset:calc(440 - (440 * 12) / 100); */
  stroke:#ff6600;
}

 .custom1 svg circle:nth-child(2)
 {
	stroke-dashoffset:calc(440 - (440 * ${Negative_Percentage }) / 100);	
  /* stroke-dashoffset:calc(440 - (440 * 12) / 100); */
  stroke:#ff6600;
}

 .custom2 svg circle:nth-child(2)
 {
	stroke-dashoffset:calc(440 - (440 * ${Neutral_Percentage }) / 100);	
  /* stroke-dashoffset:calc(440 - (440 * 12) / 100); */
  stroke:#ff6600;
}

.box .percent .num
{
  top:0;
  left:0;
  width:100%;
  height:100%;
  display:flex;
  justify-content:center;
  align-items:center;
  position:absolute;
  color:#111;
}
.box .percent .num h2
{
  font-size:40px;
}
.box .percent .num h2 span
{
  font-size:24px;
}
.box .text
{
  padding 10px 0 0;
  color:#999;
  font-weight:700;
  letter-spacing:1px;
}

.centering{
text-align: center;
}

</style>
</head>
<body>


<div>

<div class="centering">

	<h1 style="color:#0913eb;">
		Sentiment Analysis Results <br> <br> 
	</h1>

<h2 style="color:#0d32a2;">Total Messages:	${Total } </h2> <br>

</div>


<div class="boxMain">
<div class="box">
  <div class="percent custom0">
    <svg>
      <circle cx="70" cy="70" r="70"></circle>
      <circle cx="70" cy="70" r="70"></circle>
    </svg>
    <div class="num">
      <h2> ${Positive_Percentage }<span>%</span></h2>
    </div>
  </div>
  <h2 class="text">Positive</h2>
</div>

<div class="box">
  <div class="percent custom1">
    <svg>
      <circle cx="70" cy="70" r="70"></circle>
      <circle cx="70" cy="70" r="70"></circle>
    </svg>
    <div class="num">
      <h2> ${Negative_Percentage }<span>%</span></h2>
    </div>
  </div>
  <h2 class="text">Negative</h2>
</div>

<div class="box">
  <div class="percent custom2">
    <svg>
      <circle cx="70" cy="70" r="70"></circle>
      <circle cx="70" cy="70" r="70"></circle>
    </svg>
    <div class="num">
      <h2> ${Neutral_Percentage }<span>%</span></h2>
    </div>
  </div>
  <h2 class="text">Neutral</h2>
</div>

</div>


<div class="centering">
	<h2 style="color:green;">
		<br>${General_Consensus }
	</h2>
</div>

</div>
</h2>
</body>
</html>
 
 