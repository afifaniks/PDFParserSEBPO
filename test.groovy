import me.afifaniks.parsers.TessPDFParser

TessPDFParser pdfParser = new TessPDFParser("/home/afif/SEBPO/RDCScrapper/development/src/main/groovy/current_scripts/pdf_parser_tess/data/18_042_Redacted.pdf",
        [dpi: 150,
         imageMode: "binary",
         pages: [1, 2, 3] as Integer[],
         toFile: false,
         tessDataPath: "/home/afif/Desktop/PDFParser/tessdata"])
String text = pdfParser.convert();
println(text)
