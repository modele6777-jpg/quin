package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yxb extends zd5 {
    public static final e1a f;
    public final ClassLoader c;
    public final zd5 d;
    public final ace e;

    static {
        String str = e1a.b;
        f = y25.r("/");
    }

    public yxb(ClassLoader classLoader) {
        tl7 tl7Var = zd5.a;
        tl7Var.getClass();
        this.c = classLoader;
        this.d = tl7Var;
        this.e = new ace(new hla(8, this));
    }

    @Override // defpackage.zd5
    public final List N(e1a e1aVar) throws FileNotFoundException {
        e1a e1aVar2 = f;
        e1aVar2.getClass();
        String strT = c.a(e1aVar2, e1aVar, true).d(e1aVar2).a.t();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (iy9 iy9Var : (List) this.e.getValue()) {
            zd5 zd5Var = (zd5) iy9Var.a();
            e1a e1aVar3 = (e1a) iy9Var.b();
            try {
                List listN = zd5Var.N(e1aVar3.e(strT));
                ArrayList<e1a> arrayList = new ArrayList();
                for (Object obj : listN) {
                    if (xxb.t((e1a) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                for (e1a e1aVar4 : arrayList) {
                    e1aVar4.getClass();
                    String strReplace = v4e.Y(e1aVar3.a.t(), e1aVar4.a.t()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(e1aVar2.e(strReplace));
                }
                x72.g0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return s72.j1(linkedHashSet);
        }
        pd4.l(e1aVar, "file not found: ");
        return null;
    }

    @Override // defpackage.zd5
    public final ld5 U(e1a e1aVar) {
        e1aVar.getClass();
        if (!xxb.t(e1aVar)) {
            return null;
        }
        e1a e1aVar2 = f;
        e1aVar2.getClass();
        String strT = c.a(e1aVar2, e1aVar, true).d(e1aVar2).a.t();
        for (iy9 iy9Var : (List) this.e.getValue()) {
            ld5 ld5VarU = ((zd5) iy9Var.a()).U(((e1a) iy9Var.b()).e(strT));
            if (ld5VarU != null) {
                return ld5VarU;
            }
        }
        return null;
    }

    @Override // defpackage.zd5
    public final jk7 W(e1a e1aVar) throws FileNotFoundException {
        if (!xxb.t(e1aVar)) {
            pd4.l(e1aVar, "file not found: ");
            return null;
        }
        e1a e1aVar2 = f;
        e1aVar2.getClass();
        String strT = c.a(e1aVar2, e1aVar, true).d(e1aVar2).a.t();
        Iterator it = ((List) this.e.getValue()).iterator();
        while (it.hasNext()) {
            iy9 iy9Var = (iy9) it.next();
            try {
                return ((zd5) iy9Var.a()).W(((e1a) iy9Var.b()).e(strT));
            } catch (FileNotFoundException unused) {
            }
        }
        pd4.l(e1aVar, "file not found: ");
        return null;
    }

    @Override // defpackage.zd5
    public final wkd b(e1a e1aVar) throws IOException {
        e1aVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.zd5
    public final wkd g0(e1a e1aVar, boolean z) throws IOException {
        e1aVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.zd5
    public final void h(e1a e1aVar, e1a e1aVar2) throws IOException {
        e1aVar.getClass();
        e1aVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.zd5
    public final mtd h0(e1a e1aVar) throws IOException {
        e1aVar.getClass();
        if (!xxb.t(e1aVar)) {
            pd4.l(e1aVar, "file not found: ");
            return null;
        }
        e1a e1aVar2 = f;
        e1aVar2.getClass();
        URL resource = this.c.getResource(c.a(e1aVar2, e1aVar, false).d(e1aVar2).a.t());
        if (resource == null) {
            pd4.l(e1aVar, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return z5c.K(inputStream);
    }

    @Override // defpackage.zd5
    public final void u(e1a e1aVar) throws IOException {
        e1aVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.zd5
    public final void x(e1a e1aVar) throws IOException {
        e1aVar.getClass();
        throw new IOException(this + " is read-only");
    }
}
