package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.adjust.sdk.sig.r3;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zh8 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static vi8 a(final String str, Callable callable, Runnable runnable) {
        uh8 uh8VarA = str == null ? null : vh8.b.a(str);
        vi8 vi8Var = uh8VarA != null ? new vi8(uh8VarA) : null;
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            vi8Var = (vi8) map.get(str);
        }
        if (vi8Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return vi8Var;
        }
        vi8 vi8Var2 = new vi8(callable);
        if (str != null) {
            final int i = 0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            vi8Var2.b(new si8() { // from class: yh8
                @Override // defpackage.si8
                public final void onResult(Object obj) {
                    int i2 = i;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i2) {
                        case 0:
                            HashMap map2 = zh8.a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                zh8.h();
                            }
                            break;
                        default:
                            HashMap map3 = zh8.a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                zh8.h();
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            vi8Var2.a(new si8() { // from class: yh8
                @Override // defpackage.si8
                public final void onResult(Object obj) {
                    int i3 = i2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i3) {
                        case 0:
                            HashMap map2 = zh8.a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                zh8.h();
                            }
                            break;
                        default:
                            HashMap map3 = zh8.a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                zh8.h();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, vi8Var2);
                if (map.size() == 1) {
                    h();
                }
            }
        }
        return vi8Var2;
    }

    public static ti8 b(Context context, InputStream inputStream, String str) {
        uh8 uh8VarA = str == null ? null : vh8.b.a(str);
        if (uh8VarA != null) {
            return new ti8(uh8VarA);
        }
        try {
            yhb yhbVar = new yhb(z5c.K(inputStream));
            int i = 1;
            if (g(yhbVar, c).booleanValue()) {
                return e(context, new ZipInputStream(new e41(yhbVar, i)), str);
            }
            if (g(yhbVar, d).booleanValue()) {
                return d(z5c.K(new GZIPInputStream(new e41(yhbVar, i))), str);
            }
            String[] strArr = cj7.e;
            return c(new kj7(yhbVar), str, true);
        } catch (IOException e) {
            return new ti8(e);
        }
    }

    public static ti8 c(kj7 kj7Var, String str, boolean z) {
        try {
            uh8 uh8VarA = str == null ? null : vh8.b.a(str);
            if (uh8VarA != null) {
                return new ti8(uh8VarA);
            }
            uh8 uh8VarA2 = ai8.a(kj7Var);
            if (str != null) {
                vh8.b.a.d(str, uh8VarA2);
            }
            return new ti8(uh8VarA2);
        } catch (Exception e) {
            return new ti8(e);
        } finally {
            if (z) {
                xqf.b(kj7Var);
            }
        }
    }

    public static ti8 d(s47 s47Var, String str) {
        yhb yhbVar = new yhb(s47Var);
        String[] strArr = cj7.e;
        return c(new kj7(yhbVar), str, true);
    }

    public static ti8 e(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return f(context, zipInputStream, str);
        } finally {
            xqf.b(zipInputStream);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0150 A[Catch: IOException -> 0x02c3, TryCatch #3 {IOException -> 0x02c3, blocks: (B:7:0x0017, B:9:0x001d, B:12:0x0026, B:14:0x0032, B:75:0x0180, B:15:0x0037, B:17:0x0043, B:18:0x0048, B:20:0x0054, B:21:0x006c, B:24:0x0076, B:26:0x007e, B:28:0x0086, B:31:0x0090, B:33:0x0098, B:36:0x00a1, B:37:0x00a6, B:39:0x00b8, B:41:0x00d9, B:70:0x0146, B:72:0x0150, B:73:0x016d, B:69:0x0125, B:74:0x0171, B:5:0x000f, B:42:0x00e2, B:53:0x010b, B:68:0x0124, B:67:0x0121), top: B:136:0x000f, inners: #6 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0150, please report this as an issue */
    public static ti8 f(Context context, ZipInputStream zipInputStream, String str) {
        uh8 uh8VarA;
        ri8 ri8Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            uh8VarA = null;
        } else {
            try {
                uh8VarA = vh8.b.a(str);
            } catch (IOException e) {
                return new ti8(e);
            }
        }
        if (uh8VarA != null) {
            return new ti8(uh8VarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        uh8 uh8Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                yhb yhbVar = new yhb(z5c.K(zipInputStream));
                String[] strArr = cj7.e;
                uh8Var = c(new kj7(yhbVar), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new ti8(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file), file);
                    try {
                        FileOutputStream fileOutputStreamE2 = a.e(new FileOutputStream(file), file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStreamE2.write(bArr, 0, i);
                            }
                            fileOutputStreamE2.flush();
                            fileOutputStreamE2.close();
                            fileOutputStreamE.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                gf8.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th) {
                            try {
                                fileOutputStreamE2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStreamE.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    gf8.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                    Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        gf8.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile2);
                    nextEntry = zipInputStream.getNextEntry();
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (uh8Var == null) {
            return new ti8(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) uh8Var.c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    ri8Var = null;
                    break;
                }
                ri8Var = (ri8) it.next();
            } while (!ri8Var.d.equals(str4));
            if (ri8Var != null) {
                ri8Var.f = xqf.d((Bitmap) entry.getValue(), ri8Var.a, ri8Var.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (up5 up5Var : uh8Var.f.values()) {
                if (up5Var.a.equals(entry2.getKey())) {
                    up5Var.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                gf8.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) uh8Var.c()).entrySet().iterator();
            while (it2.hasNext()) {
                ri8 ri8Var2 = (ri8) ((Map.Entry) it2.next()).getValue();
                if (ri8Var2 == null) {
                    return null;
                }
                String str5 = ri8Var2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            ri8Var2.f = xqf.d(bitmapDecodeByteArray, ri8Var2.a, ri8Var2.b);
                        }
                    } catch (IllegalArgumentException e2) {
                        gf8.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            vh8.b.a.d(str, uh8Var);
        }
        return new ti8(uh8Var);
    }

    public static Boolean g(yhb yhbVar, byte[] bArr) {
        try {
            yhb yhbVarPeek = yhbVar.peek();
            for (byte b2 : bArr) {
                if (yhbVarPeek.u() != b2) {
                    return Boolean.FALSE;
                }
            }
            yhbVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            gf8.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void h() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        r3.f();
    }
}
