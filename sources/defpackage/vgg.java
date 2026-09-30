package defpackage;

import com.google.android.play.core.assetpacks.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vgg {
    public static final rch c = new rch("PackMetadataManager");
    public final b a;
    public final wgg b;

    public vgg(b bVar, wgg wggVar) {
        this.a = bVar;
        this.b = wggVar;
    }

    public final String a(String str) {
        b bVar = this.a;
        bVar.getClass();
        try {
            if (bVar.k(str) != null) {
                int iA = this.b.a();
                File file = new File(new File(bVar.h(iA, b.b(new File(new File(bVar.d(), str), String.valueOf((int) b.b(new File(bVar.d(), str))))), str), "_metadata"), "properties.dat");
                try {
                    if (!file.exists()) {
                        return String.valueOf(iA);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        Properties properties = new Properties();
                        properties.load(fileInputStream);
                        fileInputStream.close();
                        String property = properties.getProperty("moduleVersionTag");
                        return property == null ? String.valueOf(iA) : property;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    c.b("Failed to read pack version tag for pack %s", str);
                }
            }
        } catch (IOException unused2) {
        }
        return "";
    }

    public final void b(int i, long j, String str, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        b bVar = this.a;
        bVar.getClass();
        File file = new File(new File(bVar.h(i, j, str), "_metadata"), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
