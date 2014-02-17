<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <title>The W3C Markup Validation Service</title>
    <link rev="made" href="mailto:www-validator@w3.org" />
    <link rel="shortcut icon" href="http://www.w3.org/2008/site/images/favicon.ico" type="image/x-icon" />
    <link rev="start" href="./" title="Home Page" />
    <style type="text/css" media="all">
      @import "./style/base";
    </style>
    <script type="text/javascript" src="scripts/combined"></script>
    <meta name="keywords" content="HTML, HyperText Markup Language, Validation, W3C Markup Validation Service" />
    <meta name="description" content="W3C's easy-to-use markup validation service, based on SGML and XML parsers." />
    <link rel="alternate" type="application/atom+xml" href="http://www.w3.org/QA/Tools/validator-whatsnew.atom" />
  </head>

  <body>

    <div id="banner">
      <h1 id="title">
        <a href="http://www.w3.org/"><img alt="W3C" width="110" height="61" id="logo" src="./images/w3c.png" /></a>
	<a href="./"><span>Markup Validation Service</span></a>
      </h1>
      <p id="tagline">Check the markup (HTML, XHTML, …) of Web documents</p>
    </div>

    <div id="frontforms">
      <ul id="tabset_tabs">
	<li><a href="#validate-by-uri"><span>Validate by</span> URI</a></li>
	<li><a href="#validate-by-upload"><span>Validate by</span> File Upload</a></li>
	<li><a href="#validate-by-input"><span>Validate by</span> Direct Input</a></li>
      </ul>
      <div id="fields">
        <fieldset id="validate-by-uri" class="tabset_content front"><legend class="tabset_label">Validate by URI</legend>
          <form method="get" action="check">
            <p class="instructions">
	      Validate a document online:     
            </p>
            <p>
	      <label title="Address of page to Validate" for="uri">Address:</label>
              <input type="text" name="uri" id="uri" size="45" />
            </p>
            <fieldset id="extra_opt_uri" class="moreoptions">
	      <legend class="toggletext"><a href="#validate_by_uri+with_options"><img id="toggleiconURI" class="toggleicon" src="./images/arrow-closed.png" alt="Show" /> More Options</a></legend>
	      <div class="options">
                <table>
                  <tr>
                    <th>
                      <label for="uri-charset">Character Encoding</label>
                    </th>
                    <td>
                      <select id="uri-charset" name="charset">
                        <option value="(detect automatically)" selected="selected">(detect automatically)</option>
                        <option value="utf-8">utf-8 (Unicode, worldwide)</option>
                        <option value="utf-16">utf-16 (Unicode, worldwide)</option>
                        <option value="iso-8859-1">iso-8859-1 (Western Europe)</option>
                        <option value="iso-8859-2">iso-8859-2 (Central Europe)</option>
                        <option value="iso-8859-3">iso-8859-3 (Southern Europe)</option>
                        <option value="iso-8859-4">iso-8859-4 (North European)</option>
                        <option value="iso-8859-5">iso-8859-5 (Cyrillic)</option>
                        <option value="iso-8859-6-i">iso-8859-6-i (Arabic)</option>
                        <option value="iso-8859-7">iso-8859-7 (Greek)</option>
                        <option value="iso-8859-8">iso-8859-8 (Hebrew, visual)</option>
                        <option value="iso-8859-8-i">iso-8859-8-i (Hebrew, logical)</option>
                        <option value="iso-8859-9">iso-8859-9 (Turkish)</option>
                        <option value="iso-8859-10">iso-8859-10 (Latin 6)</option>
                        <option value="iso-8859-11">iso-8859-11 (Latin/Thai)</option>
                        <option value="iso-8859-13">iso-8859-13 (Latin 7, Baltic Rim)</option>
                        <option value="iso-8859-14">iso-8859-14 (Latin 8, Celtic)</option>
                        <option value="iso-8859-15">iso-8859-15 (Latin 9)</option>
                        <option value="iso-8859-16">iso-8859-16 (Latin 10)</option>
                        <option value="us-ascii">us-ascii (basic English)</option>
                        <option value="euc-jp">euc-jp (Japanese, Unix)</option>
                        <option value="shift_jis">shift_jis (Japanese, Win/Mac)</option>
                        <option value="iso-2022-jp">iso-2022-jp (Japanese, email)</option>
                        <option value="euc-kr">euc-kr (Korean)</option>
                        <option value="ksc_5601">ksc_5601 (Korean)</option>
                        <option value="gb2312">gb2312 (Chinese, simplified)</option>
                        <option value="gb18030">gb18030 (Chinese, simplified)</option>
                        <option value="big5">big5 (Chinese, traditional)</option>
                        <option value="big5-HKSCS">Big5-HKSCS (Chinese, Hong Kong)</option>
                        <option value="tis-620">tis-620 (Thai)</option>
                        <option value="koi8-r">koi8-r (Russian)</option>
                        <option value="koi8-u">koi8-u (Ukrainian)</option>
                        <option value="iso-ir-111">iso-ir-111 (Cyrillic KOI-8)</option>
                        <option value="macintosh">macintosh (MacRoman)</option>
                        <option value="windows-1250">windows-1250 (Central Europe)</option>
                        <option value="windows-1251">windows-1251 (Cyrillic)</option>
                        <option value="windows-1252">windows-1252 (Western Europe)</option>
                        <option value="windows-1253">windows-1253 (Greek)</option>
                        <option value="windows-1254">windows-1254 (Turkish)</option>
                        <option value="windows-1255">windows-1255 (Hebrew)</option>
                        <option value="windows-1256">windows-1256 (Arabic)</option>
                        <option value="windows-1257">windows-1257 (Baltic Rim)</option>
                      </select>

                    </td>
                    <td><input id="uri-fbc" name="fbc" type="checkbox" value="1" /><label for="uri-fbc" title="Use selected Character encoding only if missing in the document">Only if missing</label></td>
                  </tr>
                  <tr>
                    <th>
                      <label for="uri-doctype">Document Type</label>
                    </th>
                    <td>
                      <select id="uri-doctype" name="doctype">
                        <option value="Inline" selected="selected">(detect automatically)</option>
                        <option value="HTML5">HTML5 (experimental)</option>
                        <option value="XHTML 1.0 Strict">XHTML 1.0 Strict</option>
                        <option value="XHTML 1.0 Transitional">XHTML 1.0 Transitional</option>
                        <option value="XHTML 1.0 Frameset">XHTML 1.0 Frameset</option>
                        <option value="HTML 4.01 Strict">HTML 4.01 Strict</option>
                        <option value="HTML 4.01 Transitional">HTML 4.01 Transitional</option>
                        <option value="HTML 4.01 Frameset">HTML 4.01 Frameset</option>
                        <option value="HTML 4.01 + RDFa 1.1">HTML 4.01 + RDFa 1.1</option>
                        <option value="HTML 3.2">HTML 3.2</option>
                        <option value="HTML 2.0">HTML 2.0</option>
                        <option value="ISO/IEC 15445:2000 (&quot;ISO HTML&quot;)">ISO/IEC 15445:2000 ("ISO HTML")</option>
                        <option value="XHTML 1.1">XHTML 1.1</option>
                        <option value="XHTML + RDFa">XHTML + RDFa</option>
                        <option value="XHTML Basic 1.0">XHTML Basic 1.0</option>
                        <option value="XHTML Basic 1.1">XHTML Basic 1.1</option>
                        <option value="XHTML Mobile Profile 1.2">XHTML Mobile Profile 1.2</option>
                        <option value="XHTML-Print 1.0">XHTML-Print 1.0</option>
                        <option value="XHTML 1.1 plus MathML 2.0">XHTML 1.1 plus MathML 2.0</option> 
                        <option value="XHTML 1.1 plus MathML 2.0 plus SVG 1.1">XHTML 1.1 plus MathML 2.0 plus SVG 1.1</option> 
                        <option value="MathML 2.0">MathML 2.0</option>
                        <option value="SVG 1.0">SVG 1.0</option>
                        <option value="SVG 1.1">SVG 1.1</option>
                        <option value="SVG 1.1 Tiny">SVG 1.1 Tiny</option>
                        <option value="SVG 1.1 Basic">SVG 1.1 Basic</option>
                        <option value="SMIL 1.0">SMIL 1.0</option>
                        <option value="SMIL 2.0">SMIL 2.0</option>
                      </select>
                    </td>
                    <td><label for="uri-fbd"><input id="uri-fbd" name="fbd" type="checkbox" value="1" title="Use selected Document Type only if missing in the document" />Only if missing</label></td>
                  </tr>
                  <tr>
                    <td colspan="3"><input type="radio" name="group" id="urigroup_no" value="0" checked="checked" /><label for="urigroup_no">List Messages Sequentially</label> <input type="radio" name="group" id="urigroup_yes" value="1" /><label for="urigroup_yes">Group Error Messages by Type</label></td>

                  </tr>
                  <tr>
                    <td><input id="uri-ss" name="ss" type="checkbox" value="1" /><label title="Show Page Source" for="uri-ss">Show Source</label></td>
                    <td colspan="2"><input id="uri-st" name="st" type="checkbox" value="1" /><label for="uri-st">Clean up Markup with HTML-Tidy</label>
                    </td>
                    


                  </tr>
                  <tr>
                    <td><input id="uri-outline" name="outline" type="checkbox" value="1" /><label title="Show an Outline of the document" for="uri-outline">Show Outline</label>
                    </td>
                    <td><input id="uri-No200" name="No200" type="checkbox" value="1" /><label title="Validate also pages for which the HTTP status code indicates an error" for="uri-No200">Validate error pages</label></td>

                    <td><input id="uri-verbose" name="verbose" type="checkbox" value="1" /><label title="Verbose Output" for="uri-verbose">Verbose Output</label></td>
                  </tr>
                </table>
              </div>
            </fieldset>
	    <p class="submit_button"><input type="submit" title="Submit for validation" value="Check" /></p>
          </form>
        </fieldset>
        <fieldset id="validate-by-upload"  class="tabset_content front"><legend class="tabset_label">Validate by File Upload</legend>
          <form method="post" enctype="multipart/form-data" action="check">
            <p class="instructions">Upload a document for validation:</p>
            <p><label title="Choose a Local File to Upload and Validate" for="uploaded_file">File:</label>
              <input type="file" id="uploaded_file" name="uploaded_file" size="30" /></p>        
            <fieldset id="extra_opt_upload" class="moreoptions">
	      <legend class="toggletext"><a href="#validate_by_upload+with_options"><img class="toggleicon" src="./images/arrow-closed.png" alt="Show" /> More Options</a></legend>
	      <div class="options">
                <table>
                  <tr>
                    <th>
                      <label for="upload-charset">Character Encoding</label>
                    </th>
                    <td>
                      <select id="upload-charset" name="charset">
                        <option value="(detect automatically)" selected="selected">(detect automatically)</option>
                        <option value="utf-8">utf-8 (Unicode, worldwide)</option>
                        <option value="utf-16">utf-16 (Unicode, worldwide)</option>
                        <option value="iso-8859-1">iso-8859-1 (Western Europe)</option>
                        <option value="iso-8859-2">iso-8859-2 (Central Europe)</option>
                        <option value="iso-8859-3">iso-8859-3 (Southern Europe)</option>
                        <option value="iso-8859-4">iso-8859-4 (North European)</option>
                        <option value="iso-8859-5">iso-8859-5 (Cyrillic)</option>
                        <option value="iso-8859-6-i">iso-8859-6-i (Arabic)</option>
                        <option value="iso-8859-7">iso-8859-7 (Greek)</option>
                        <option value="iso-8859-8">iso-8859-8 (Hebrew, visual)</option>
                        <option value="iso-8859-8-i">iso-8859-8-i (Hebrew, logical)</option>
                        <option value="iso-8859-9">iso-8859-9 (Turkish)</option>
                        <option value="iso-8859-10">iso-8859-10 (Latin 6)</option>
                        <option value="iso-8859-11">iso-8859-11 (Latin/Thai)</option>
                        <option value="iso-8859-13">iso-8859-13 (Latin 7, Baltic Rim)</option>
                        <option value="iso-8859-14">iso-8859-14 (Latin 8, Celtic)</option>
                        <option value="iso-8859-15">iso-8859-15 (Latin 9)</option>
                        <option value="iso-8859-16">iso-8859-16 (Latin 10)</option>
                        <option value="us-ascii">us-ascii (basic English)</option>
                        <option value="euc-jp">euc-jp (Japanese, Unix)</option>
                        <option value="shift_jis">shift_jis (Japanese, Win/Mac)</option>
                        <option value="iso-2022-jp">iso-2022-jp (Japanese, email)</option>
                        <option value="euc-kr">euc-kr (Korean)</option>
                        <option value="ksc_5601">ksc_5601 (Korean)</option>
                        <option value="gb2312">gb2312 (Chinese, simplified)</option>
                        <option value="gb18030">gb18030 (Chinese, simplified)</option>
                        <option value="big5">big5 (Chinese, traditional)</option>
                        <option value="big5-HKSCS">Big5-HKSCS (Chinese, Hong Kong)</option>
                        <option value="tis-620">tis-620 (Thai)</option>
                        <option value="koi8-r">koi8-r (Russian)</option>
                        <option value="koi8-u">koi8-u (Ukrainian)</option>
                        <option value="iso-ir-111">iso-ir-111 (Cyrillic KOI-8)</option>
                        <option value="macintosh">macintosh (MacRoman)</option>
                        <option value="windows-1250">windows-1250 (Central Europe)</option>
                        <option value="windows-1251">windows-1251 (Cyrillic)</option>
                        <option value="windows-1252">windows-1252 (Western Europe)</option>
                        <option value="windows-1253">windows-1253 (Greek)</option>
                        <option value="windows-1254">windows-1254 (Turkish)</option>
                        <option value="windows-1255">windows-1255 (Hebrew)</option>
                        <option value="windows-1256">windows-1256 (Arabic)</option>
                        <option value="windows-1257">windows-1257 (Baltic Rim)</option>
                      </select>
                    </td>
                    <td><input id="upload-fbc" name="fbc" type="checkbox" value="1" /><label for="upload-fbc" title="Use selected Character encoding only if missing in the document">Only if missing</label></td>
                  </tr>
                  <tr>
                    <th>
                      <label for="upload-doctype">Document Type</label>
                    </th>
                    <td>
                      <select id="upload-doctype" name="doctype">
                        <option value="Inline" selected="selected">(detect automatically)</option>
                        <option value="HTML5">HTML5 (experimental)</option>
                        <option value="XHTML 1.0 Strict">XHTML 1.0 Strict</option>
                        <option value="XHTML 1.0 Transitional">XHTML 1.0 Transitional</option>
                        <option value="XHTML 1.0 Frameset">XHTML 1.0 Frameset</option>
                        <option value="HTML 4.01 Strict">HTML 4.01 Strict</option>
                        <option value="HTML 4.01 Transitional">HTML 4.01 Transitional</option>
                        <option value="HTML 4.01 Frameset">HTML 4.01 Frameset</option>
                        <option value="HTML 4.01 + RDFa 1.1">HTML 4.01 + RDFa 1.1</option>
                        <option value="HTML 3.2">HTML 3.2</option>
                        <option value="HTML 2.0">HTML 2.0</option>
                        <option value="ISO/IEC 15445:2000 (&quot;ISO HTML&quot;)">ISO/IEC 15445:2000 ("ISO HTML")</option>
                        <option value="XHTML 1.1">XHTML 1.1</option>
                        <option value="XHTML + RDFa">XHTML + RDFa</option>
                        <option value="XHTML Basic 1.0">XHTML Basic 1.0</option>
                        <option value="XHTML Basic 1.1">XHTML Basic 1.1</option>
                        <option value="XHTML Mobile Profile 1.2">XHTML Mobile Profile 1.2</option>
                        <option value="XHTML-Print 1.0">XHTML-Print 1.0</option>
                        <option value="XHTML 1.1 plus MathML 2.0">XHTML 1.1 plus MathML 2.0</option> 
                        <option value="XHTML 1.1 plus MathML 2.0 plus SVG 1.1">XHTML 1.1 plus MathML 2.0 plus SVG 1.1</option> 
                        <option value="MathML 2.0">MathML 2.0</option>
                        <option value="SVG 1.0">SVG 1.0</option>
                        <option value="SVG 1.1">SVG 1.1</option>
                        <option value="SVG 1.1 Tiny">SVG 1.1 Tiny</option>
                        <option value="SVG 1.1 Basic">SVG 1.1 Basic</option>
                        <option value="SMIL 1.0">SMIL 1.0</option>
                        <option value="SMIL 2.0">SMIL 2.0</option>
                      </select>
                    </td>
                    <td><label for="upload-fbd"><input id="upload-fbd" name="fbd" type="checkbox" value="1" title="Use selected Document Type only if missing in the document" />Only if missing</label></td>
                  </tr>
                  <tr>
                    <td colspan="3"><input type="radio" name="group" id="uploadgroup_no" value="0" checked="checked" /><label for="uploadgroup_no">List Messages Sequentially</label> <input type="radio" name="group" id="uploadgroup_yes" value="1" /><label for="uploadgroup_yes">Group Error Messages by Type</label></td>

                  </tr>
                  <tr>
                    <td><input id="upload-ss" name="ss" type="checkbox" value="1" /><label title="Show Page Source" for="upload-ss">Show Source</label></td>
                    <td colspan="2"><input id="upload-st" name="st" type="checkbox" value="1" /><label for="upload-st">Clean up Markup with HTML-Tidy</label>
                    </td>
                  </tr>
                  <tr>
                    <td><input id="upload-outline" name="outline" type="checkbox" value="1" /><label title="Show an Outline of the document" for="upload-outline">Show Outline</label>
                    </td>
                    <td><input id="upload-No200" name="No200" type="checkbox" value="1" /><label title="Validate also pages for which the HTTP status code indicates an error" for="upload-No200">Validate error pages</label></td>
                    <td><input id="upload-verbose" name="verbose" type="checkbox" value="1" /><label title="Verbose Output" for="upload-verbose">Verbose Output</label></td>
                  </tr>
                </table>
              </div>
            </fieldset><!-- invisible -->
	    <p class="submit_button"><input title="Submit for validation" type="submit" value="Check" /></p>
          </form>
          <p><strong>Note</strong>: file upload may not work with Internet
            Explorer on some versions of Windows XP Service Pack 2, see our
            <a href="http://www.w3.org/QA/2005/01/Validator-IE_WinXP_SP2">information page</a>
            on the W3C QA Website.</p>
        </fieldset>
        <fieldset id="validate-by-input"  class="tabset_content front"><legend class="tabset_label">Validate by direct input</legend>
          <form method="post" enctype="multipart/form-data" action="check">
            <p class="instructions"><label title="Paste a complete (HTML) Document here" for="fragment">Enter the Markup to validate</label>:<br />
              <textarea id="fragment" name="fragment" rows="12" cols="80"></textarea>
            </p>
            <fieldset id="extra_opt_direct" class="moreoptions">
              <legend class="toggletext"><a href="#validate_by_input+with_options"><img class="toggleicon" src="./images/arrow-closed.png" alt="Show" /> More Options</a></legend>
              <div class="options">
                <table>
                  <tr>
                    <th colspan="3">
                      <input id="direct_prefill_no" name="prefill" type="radio" value="0" checked="checked" />
                      <label for="direct_prefill_no">Validate Full Document</label>
                    </th>
                  </tr>
                  <tr class="subchoice" id="choice_full">
                    <th class="subchoice_head"><label for="direct-doctype">Use Doctype:</label></th>
                    <td>
                      <select id="direct-doctype" name="doctype">
                        <option value="Inline" selected="selected">(detect automatically)</option>
                        <option value="HTML5">HTML5 (experimental)</option>
                        <option value="XHTML 1.0 Strict">XHTML 1.0 Strict</option>
                        <option value="XHTML 1.0 Transitional">XHTML 1.0 Transitional</option>
                        <option value="XHTML 1.0 Frameset">XHTML 1.0 Frameset</option>
                        <option value="HTML 4.01 Strict">HTML 4.01 Strict</option>
                        <option value="HTML 4.01 Transitional">HTML 4.01 Transitional</option>
                        <option value="HTML 4.01 Frameset">HTML 4.01 Frameset</option>
                        <option value="HTML 4.01 + RDFa 1.1">HTML 4.01 + RDFa 1.1</option>
                        <option value="HTML 3.2">HTML 3.2</option>
                        <option value="HTML 2.0">HTML 2.0</option>
                        <option value="ISO/IEC 15445:2000 (&quot;ISO HTML&quot;)">ISO/IEC 15445:2000 ("ISO HTML")</option>
                        <option value="XHTML 1.1">XHTML 1.1</option>
                        <option value="XHTML + RDFa">XHTML + RDFa</option>
                        <option value="XHTML Basic 1.0">XHTML Basic 1.0</option>
                        <option value="XHTML Basic 1.1">XHTML Basic 1.1</option>
                        <option value="XHTML Mobile Profile 1.2">XHTML Mobile Profile 1.2</option>
                        <option value="XHTML-Print 1.0">XHTML-Print 1.0</option>
                        <option value="XHTML 1.1 plus MathML 2.0">XHTML 1.1 plus MathML 2.0</option> 
                        <option value="XHTML 1.1 plus MathML 2.0 plus SVG 1.1">XHTML 1.1 plus MathML 2.0 plus SVG 1.1</option> 
                        <option value="MathML 2.0">MathML 2.0</option>
                        <option value="SVG 1.0">SVG 1.0</option>
                        <option value="SVG 1.1">SVG 1.1</option>
                        <option value="SVG 1.1 Tiny">SVG 1.1 Tiny</option>
                        <option value="SVG 1.1 Basic">SVG 1.1 Basic</option>
                        <option value="SMIL 1.0">SMIL 1.0</option>
                        <option value="SMIL 2.0">SMIL 2.0</option>
                    </select></td>
                    <td>            <input id="direct-fbd" name="fbd" type="checkbox" value="1" /><label for="direct-fbd">Only if Doctype is missing</label></td>
                  </tr>
                  <tr><th colspan="3"><input id="direct_prefill_yes" name="prefill" type="radio" value="1" />
                      <label for="direct_prefill_yes">Validate HTML fragment</label></th></tr>
                  <tr class="subchoice" id="choice_frag">
                    <th class="subchoice_head">Use Doctype:</th>
                    <td colspan="2">
                      <input type="radio" name="prefill_doctype" id="directfill_doctype_html401" value="html401" checked="checked" /><label for="directfill_doctype_html401">HTML 4.01</label> 
                      <input type="radio" name="prefill_doctype" id="directfill_doctype_xhtml10" value="xhtml10" /><label for="directfill_doctype_xhtml10">XHTML 1.0</label></td></tr>
                  <tr>
                    <td colspan="3"><input type="radio" name="group" id="directgroup_no" value="0" checked="checked" /><label for="directgroup_no">List Messages Sequentially</label> <input type="radio" name="group" id="directgroup_yes" value="1" /><label for="directgroup_yes">Group Error Messages by Type</label></td>
                  </tr>
                  <tr>
                    <td><input id="direct-ss" name="ss" type="checkbox" value="1" /><label title="Show Page Source" for="direct-ss">Show Source</label></td>
                    <td colspan="2"><input id="direct-st" name="st" type="checkbox" value="1" />
                      <label for="direct-st">Clean up Markup with HTML-Tidy</label>
                    </td>
                  </tr>
                  <tr>
                    <td>
                      <input id="direct-outline" name="outline" type="checkbox" value="1" /><label title="Show an Outline of the document" for="direct-outline">Show Outline</label>
                    </td>
                    <td>
                      <input id="direct-No200" name="No200" type="checkbox" value="1" /><label title="Validate also pages for which the HTTP status code indicates an error" for="direct-No200">Validate error pages</label>
                    </td>
                    <td>
                      <input id="direct-verbose" name="verbose" type="checkbox" value="1" /><label title="Verbose Output" for="direct-verbose">Verbose Output</label>
                    </td>
                  </tr>
                </table>
              </div>
            </fieldset>
            <p class="submit_button">
              <input title="Submit for validation" type="submit" value="Check" />
            </p>
          </form>
        </fieldset>
      </div><!-- fields -->
    </div> <!-- frontforms -->

    <div class="intro">
      <p>
        This validator checks the 
        <a href="docs/help.html#validation_basics" title="What is markup validation?">markup validity</a>
        of Web documents in HTML, XHTML, SMIL, MathML, etc.
        If you wish to validate specific content such as 
        <a href="http://validator.w3.org/feed/" title="Feed validator, hosted at W3C">RSS/Atom feeds</a> or
	<a href="http://jigsaw.w3.org/css-validator/" title="W3C CSS Validation Service">CSS stylesheets</a>, 
	<a href="http://validator.w3.org/mobile/" title="MobileOK Checker">MobileOK content</a>,
        or to <a href="http://validator.w3.org/checklink" title="W3C Link Checker">find broken links</a>, 
        there are <a href="http://www.w3.org/QA/Tools/">other validators and tools</a> available.
 	As an alternative you can also try our <a href="http://validator.w3.org/nu">non-DTD-based validator</a>.
      </p>
    </div>

    <div id="w3c-include">
      <script type="text/javascript" src="//www.w3.org/QA/Tools/w3c-include.js"></script>
    </div>

    <ul class="navbar" id="menu"><li><a href="./" accesskey="1" title="Go to the Home Page for The W3C Markup Validation Service">Home</a><span> | </span></li>
      <li><a href="./about.html" title="Information About this Service">About...</a><span> | </span></li>
      <li><a href="./whatsnew.html" title="The changes made to this service recently">News</a><span> | </span></li>
      <li><a href="./docs/" accesskey="3" title="Documentation for this Service">Docs</a><span> | </span></li>
      <li><a href="./docs/help.html" title="Help and answers to frequently asked questions">Help&nbsp;&amp;&nbsp;<acronym title="Frequently Asked Questions">FAQ</acronym></a><span> | </span></li>
      <li><a href="./feedback.html" accesskey="4" title="How to provide feedback on this service">Feedback</a></li>
e      <li><a href="./contribute.html" title="How to contribute to the validator project">Contribute</a></li>
    </ul>

    <div id="footer">
      <p id="activity_logos">
        <a href="http://www.w3.org/Status" title="W3C's Open Source, bringing you free Web quality tools and more"><img src="http://www.w3.org/Icons/WWW/w3c_home_nb" alt="W3C" width="72" height="47" /><img src="./images/opensource-55x48.png" alt="Open-Source" title="We are building certified Open Source/Free Software. - see www.opensource.org" width="55" height="48" /></a>
      </p>
      <p id="support_logo">
	<a href="http://www.w3.org/QA/Tools/Donate">
	  <img src="http://www.w3.org/QA/Tools/I_heart_validator" alt="I heart Validator logo" title=" Validators Donation Program" width="80" height="15" />
	</a>
      </p>
      <p id="version_info">
        This service runs the W3C Markup Validator, <a href="./whatsnew.html#v13"><abbr title="version">v</abbr>1.3</a>.
      </p>
      <p class="copyright">
	<a rel="Copyright" href="http://www.w3.org/Consortium/Legal/ipr-notice#Copyright">Copyright</a> &copy; 1994-2012
	<a href="http://www.w3.org/"><acronym title="World Wide Web Consortium">W3C</acronym></a>&reg;
	(<a href="http://www.csail.mit.edu/"><acronym title="Massachusetts Institute of Technology">MIT</acronym></a>,
	<a href="http://www.ercim.eu/"><acronym title="European Research Consortium for Informatics and Mathematics">ERCIM</acronym></a>,
	<a href="http://www.keio.ac.jp/">Keio</a>),
	All Rights Reserved.
	W3C <a href="http://www.w3.org/Consortium/Legal/ipr-notice#Legal_Disclaimer">liability</a>,
	<a href="http://www.w3.org/Consortium/Legal/ipr-notice#W3C_Trademarks">trademark</a>,
	<a rel="Copyright" href="http://www.w3.org/Consortium/Legal/copyright-documents">document use</a>
	and <a rel="Copyright" href="http://www.w3.org/Consortium/Legal/copyright-software">software licensing</a>
	rules apply. Your interactions with this site are in accordance
	with our <a href="http://www.w3.org/Consortium/Legal/privacy-statement#Public">public</a> and
	<a href="http://www.w3.org/Consortium/Legal/privacy-statement#Members">Member</a> privacy
	statements.
      </p>
    </div>
  </body>
</html>
