package defpackage;

import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class tl7 extends zd5 {
    @Override // defpackage.zd5
    public final List N(e1a e1aVar) throws IOException {
        File file = e1aVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                s8f.p(e1aVar, "failed to list ");
                return null;
            }
            pd4.l(e1aVar, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(e1aVar.e(str));
        }
        w72.e0(arrayList);
        return arrayList;
    }

    @Override // defpackage.zd5
    public ld5 U(e1a e1aVar) {
        e1aVar.getClass();
        File file = e1aVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new ld5(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // defpackage.zd5
    public final jk7 W(e1a e1aVar) {
        return new jk7(new RandomAccessFile(e1aVar.toFile(), "r"));
    }

    @Override // defpackage.zd5
    public final wkd b(e1a e1aVar) {
        e1aVar.getClass();
        File file = e1aVar.toFile();
        return new du9(a.d(file, new FileOutputStream(file, true), true), new jye());
    }

    @Override // defpackage.zd5
    public final wkd g0(e1a e1aVar, boolean z) throws IOException {
        e1aVar.getClass();
        if (!z || !G(e1aVar)) {
            File file = e1aVar.toFile();
            return new du9(a.d(file, new FileOutputStream(file, false), false), new jye());
        }
        throw new IOException(e1aVar + " already exists.");
    }

    @Override // defpackage.zd5
    public void h(e1a e1aVar, e1a e1aVar2) throws IOException {
        e1aVar.getClass();
        e1aVar2.getClass();
        if (e1aVar.toFile().renameTo(e1aVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + e1aVar + " to " + e1aVar2);
    }

    @Override // defpackage.zd5
    public final mtd h0(e1a e1aVar) {
        e1aVar.getClass();
        File file = e1aVar.toFile();
        return new s47(a.b(file, new FileInputStream(file)), jye.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // defpackage.zd5
    public final void u(e1a e1aVar) throws IOException {
        e1aVar.getClass();
        if (e1aVar.toFile().mkdir()) {
            return;
        }
        ld5 ld5VarU = U(e1aVar);
        if (ld5VarU == null || !ld5VarU.c) {
            s8f.p(e1aVar, "failed to create directory: ");
        }
    }

    @Override // defpackage.zd5
    public final void x(e1a e1aVar) throws IOException {
        e1aVar.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = e1aVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        s8f.p(e1aVar, "failed to delete ");
    }
}
