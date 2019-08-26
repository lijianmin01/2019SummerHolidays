



        import java.io.File;



                import org.artofsolving.jodconverter.OfficeDocumentConverter;

                import org.artofsolving.jodconverter.office.ExternalOfficeManagerConfiguration;

                import org.artofsolving.jodconverter.office.OfficeConnectionProtocol;

                import org.artofsolving.jodconverter.office.OfficeManager;



        public class PPT_2_PDF_Util {

            /**

             * ppt转pdf

             * @param inputFile 输入文件

             * @param outputFile 输出文件

             * @author ServerZhang

             * @date 2016年9月20日

             */

            public static void ppt2PDF(File inputFile, File outputFile) {

                // 如果目标路径不存在, 则新建该路径

                if (!outputFile.getParentFile().exists()) {

                    outputFile.getParentFile().mkdirs();

                }



                // convert

                ExternalOfficeManagerConfiguration configuration =

                        new ExternalOfficeManagerConfiguration();

                configuration.setConnectionProtocol(OfficeConnectionProtocol.SOCKET);

                configuration.setPortNumber(8100);

                OfficeManager officeManager= configuration

                        .buildOfficeManager();

                OfficeDocumentConverter converter =

                        new OfficeDocumentConverter(officeManager);

                converter.convert(inputFile, outputFile);

            }

        }
            File inputFile = new File("D:/PPT_test/欧洲杯球服配色.pptx");

            File outputFile = new File("D:/PPT_test/欧洲杯球服配色.pdf");


