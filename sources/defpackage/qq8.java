package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.adjust.sdk.Constants;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qq8 {
    static {
        String str = Environment.DIRECTORY_PICTURES;
    }

    public static final Uri a(Uri uri, String str) throws UnsupportedEncodingException {
        int iT;
        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
        contentUri.getClass();
        char c = me5.a;
        if (str.indexOf(0) >= 0) {
            qc0.j("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            return null;
        }
        String strSubstring = str.substring(Math.max(str.lastIndexOf(47), str.lastIndexOf(92)) + 1);
        if (strSubstring.indexOf(0) >= 0) {
            qc0.j("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            return null;
        }
        int iA = me5.a(strSubstring);
        if (iA != -1) {
            strSubstring = strSubstring.substring(0, iA);
        }
        String strM0 = v4e.m0(64, strSubstring);
        String str2 = new SimpleDateFormat("yyMMddHHmmss", Locale.ENGLISH).format(new Date());
        if (new rob(".*-[\\d]{12}$").g(strM0) && (iT = v4e.T(strM0, "-", 0, 6)) != -1) {
            strM0 = strM0.substring(0, iT);
        }
        String strJ = ib8.j(strM0, "-", str2);
        int iA2 = me5.a(str);
        String strSubstring2 = iA2 == -1 ? "" : str.substring(iA2 + 1);
        String strConcat = strSubstring2.length() > 0 ? ".".concat(strSubstring2) : "";
        StringBuilder sb = new StringBuilder();
        sb.append((Object) strJ);
        sb.append((Object) strConcat);
        String string = sb.toString();
        String str3 = Environment.DIRECTORY_DOWNLOADS;
        str3.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", string);
        contentValues.put("relative_path", str3);
        contentValues.put("is_pending", (Integer) 1);
        if (c5e.u(string, "png", false)) {
            contentValues.put("mime_type", "image/png");
        }
        Uri uriInsert = tce.b().insert(contentUri, contentValues);
        if (uriInsert == null) {
            return null;
        }
        hf8.Q.getClass();
        ef8.a("UriExt").e("copyTo: " + uri + " -> " + uriInsert);
        try {
            OutputStream outputStreamOpenOutputStream = tce.b().openOutputStream(uriInsert, "wt");
            if (outputStreamOpenOutputStream != null) {
                try {
                    InputStream inputStreamOpenInputStream = tce.b().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            lmg.Y(inputStreamOpenInputStream, outputStreamOpenOutputStream);
                            inputStreamOpenInputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ym8.t(inputStreamOpenInputStream, th);
                                throw th2;
                            }
                        }
                    }
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ym8.t(outputStreamOpenOutputStream, th3);
                        throw th4;
                    }
                }
            }
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            tce.b().update(uriInsert, contentValues, null, null);
            return uriInsert;
        } catch (Exception e) {
            hf8.Q.getClass();
            m8b m8bVarA = ef8.a("UriExt");
            String strDecode = URLDecoder.decode(String.valueOf(uri), Constants.ENCODING);
            strDecode.getClass();
            String strDecode2 = URLDecoder.decode(String.valueOf(uriInsert), Constants.ENCODING);
            strDecode2.getClass();
            m8bVarA.c(ub3.k("Failed to copy ", strDecode, " to ", strDecode2), e);
            tce.b().delete(uriInsert, null, null);
            return null;
        }
    }
}
