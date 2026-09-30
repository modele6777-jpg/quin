package defpackage;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import timber.log.Timber;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ci {
    public static final m8b a;

    static {
        hf8.Q.getClass();
        a = ef8.a("AiContentIdentifier");
    }

    public static void a(ExifInterface exifInterface, bi biVar) {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"conversationId\":\"" + biVar.a + "\",");
        sb.append("\"userUid\":\"" + biVar.b + "\",");
        sb.append("\"modelInfo\":\"DeepSeek Chat\",\"deepseekFilingId\":\"Beijing-DeepSeekChat-202404280016\"}");
        exifInterface.setAttribute("UserComment", sb.toString());
    }

    public static void b(Context context, Uri uri, bi biVar) {
        context.getClass();
        uri.getClass();
        biVar.getClass();
        int i = Build.VERSION.SDK_INT;
        m8b m8bVar = a;
        if (i >= 29) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        ExifInterface exifInterface = new ExifInterface(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        a(exifInterface, biVar);
                        exifInterface.saveAttributes();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ym8.t(parcelFileDescriptorOpenFileDescriptor, th);
                            throw th2;
                        }
                    }
                }
                return;
            } catch (Exception e) {
                m8bVar.c("Failed to write EXIF metadata to Uri", e);
                return;
            }
        }
        File file = null;
        try {
            try {
                File fileCreateTempFile = File.createTempFile("exif_temp_", ".jpg", context.getCacheDir());
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        fileCreateTempFile.getClass();
                        FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
                        try {
                            lmg.Y(inputStreamOpenInputStream, fileOutputStreamE);
                            fileOutputStreamE.close();
                            inputStreamOpenInputStream.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                ym8.t(fileOutputStreamE, th3);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            ym8.t(inputStreamOpenInputStream, th5);
                            throw th6;
                        }
                    }
                }
                ExifInterface exifInterface2 = new ExifInterface(fileCreateTempFile.getAbsolutePath());
                a(exifInterface2, biVar);
                exifInterface2.saveAttributes();
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        FileInputStream fileInputStreamB = a.b(fileCreateTempFile, new FileInputStream(fileCreateTempFile));
                        try {
                            lmg.Y(fileInputStreamB, outputStreamOpenOutputStream);
                            fileInputStreamB.close();
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                ym8.t(fileInputStreamB, th7);
                                throw th8;
                            }
                        }
                    } catch (Throwable th9) {
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            ym8.t(outputStreamOpenOutputStream, th9);
                            throw th10;
                        }
                    }
                }
                String str = "Legacy EXIF write successful for URI: " + uri;
                m8bVar.getClass();
                nx2 nx2Var = Timber.a;
                nx2Var.l(m8bVar.a);
                nx2Var.a(str, new Object[0]);
                fileCreateTempFile.delete();
            } catch (Exception e2) {
                m8bVar.c("Failed to write EXIF (legacy)", e2);
                if (0 != 0) {
                    file.delete();
                }
            }
        } catch (Throwable th11) {
            if (0 != 0) {
                file.delete();
            }
            throw th11;
        }
    }
}
