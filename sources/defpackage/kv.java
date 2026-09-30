package defpackage;

import android.content.Context;
import android.util.SparseArray;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kv implements u81 {
    public boolean a = true;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Code duplicated, block: B:110:0x0278  */
    /* JADX WARN: Code duplicated, block: B:111:0x027b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0281  */
    /* JADX WARN: Code duplicated, block: B:116:0x029a  */
    /* JADX WARN: Code duplicated, block: B:118:0x029f  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:122:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:161:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Multi-variable type inference failed */
    public kv(eah eahVar, h71 h71Var) throws Throwable {
        dpb dpbVarE;
        Throwable th;
        char c;
        long j;
        long j2;
        String str;
        int i = 1;
        w9h w9hVar = eahVar.a;
        u9h u9hVar = eahVar.b;
        if (w9hVar.a.isEmpty()) {
            u9h.y().equals(u9hVar);
        }
        this.b = u9hVar.r();
        this.c = u9hVar.s();
        u9hVar.getClass();
        u9hVar.getClass();
        Throwable th2 = null;
        Map mapW = u9hVar.v() == 0 ? null : u9hVar.w();
        if (mapW != null) {
            ry6.n(mapW.keySet());
        } else {
            int i2 = ry6.c;
            Object[] objArr = fpb.w;
        }
        int iV = u9hVar.v();
        w9h w9hVar2 = eahVar.a;
        char c2 = 3;
        if (iV > 0) {
            Collection<m9h> collectionValues = u9hVar.w().values();
            if (collectionValues == null) {
                dpbVarE = dpb.g;
            } else {
                os osVarB = ny6.b();
                for (m9h m9hVar : collectionValues) {
                    int iF = m9hVar.F();
                    int i3 = iF - 1;
                    if (iF == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        osVarB.q(m9hVar.r(), Long.valueOf(m9hVar.s()));
                    } else if (i3 == 1) {
                        osVarB.q(m9hVar.r(), Boolean.valueOf(m9hVar.t()));
                    } else if (i3 == 2) {
                        osVarB.q(m9hVar.r(), Double.valueOf(m9hVar.u()));
                    } else if (i3 == 3) {
                        osVarB.q(m9hVar.r(), m9hVar.v());
                    } else {
                        if (i3 != 4) {
                            qc0.p("Could not serialize Flag for override: ".concat(String.valueOf(m9hVar.r())));
                            throw null;
                        }
                        osVarB.q(m9hVar.r(), m9hVar.w().n());
                    }
                }
                dpbVarE = osVarB.e(false);
            }
            if (!dpbVarE.isEmpty()) {
                HashMap map = new HashMap(dpbVarE);
                vy6 vy6Var = w9hVar2.a;
                ty6 ty6Var = new ty6(ba9.a);
                gff it = vy6Var.iterator();
                while (true) {
                    ey6 ey6Var = (ey6) it;
                    if (!ey6Var.hasNext()) {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    th = th2;
                                    c = c2;
                                } else {
                                    th = th2;
                                    c = c2;
                                    long jCharAt = str2.charAt(0) - '0';
                                    if (jCharAt >= 1) {
                                        if (jCharAt <= 9) {
                                            int i4 = i;
                                            while (true) {
                                                if (i4 >= length) {
                                                    j = 0;
                                                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                        j2 = jCharAt;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                int iCharAt = str2.charAt(i4) - '0';
                                                j = 0;
                                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                                    i4++;
                                                }
                                            }
                                        }
                                        if (j2 == j) {
                                            str = str2;
                                        } else {
                                            str = th;
                                        }
                                        if (obj instanceof String) {
                                            ty6Var.b(new v9h(j2, str, 4, 0L, obj));
                                        } else if (obj instanceof byte[]) {
                                            ty6Var.b(new v9h(j2, str, 5, 0L, obj));
                                        } else if (obj instanceof Boolean) {
                                            ty6Var.b(new v9h(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                        } else if (obj instanceof Long) {
                                            ty6Var.b(new v9h(j2, str, 2, ((Long) obj).longValue(), null));
                                        } else {
                                            if (obj instanceof Double) {
                                                String strValueOf = String.valueOf(obj);
                                                qc0.p(ks0.m(new StringBuilder(str2.length() + 28 + strValueOf.length()), "Cannot serialize override ", str2, ": ", strValueOf));
                                                throw th;
                                            }
                                            ty6Var.b(new v9h(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                        }
                                        c2 = c;
                                        th2 = th;
                                        i = 1;
                                    }
                                    j2 = j;
                                    if (j2 == j) {
                                        str = str2;
                                    } else {
                                        str = th;
                                    }
                                    if (obj instanceof String) {
                                        ty6Var.b(new v9h(j2, str, 4, 0L, obj));
                                    } else if (obj instanceof byte[]) {
                                        ty6Var.b(new v9h(j2, str, 5, 0L, obj));
                                    } else if (obj instanceof Boolean) {
                                        ty6Var.b(new v9h(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                    } else if (obj instanceof Long) {
                                        ty6Var.b(new v9h(j2, str, 2, ((Long) obj).longValue(), null));
                                    } else {
                                        if (obj instanceof Double) {
                                            String strValueOf2 = String.valueOf(obj);
                                            qc0.p(ks0.m(new StringBuilder(str2.length() + 28 + strValueOf2.length()), "Cannot serialize override ", str2, ": ", strValueOf2));
                                            throw th;
                                        }
                                        ty6Var.b(new v9h(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                    }
                                    c2 = c;
                                    th2 = th;
                                    i = 1;
                                }
                                j = 0;
                                j2 = 0;
                                if (j2 == j) {
                                    str = str2;
                                } else {
                                    str = th;
                                }
                                if (obj instanceof String) {
                                    ty6Var.b(new v9h(j2, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    ty6Var.b(new v9h(j2, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    ty6Var.b(new v9h(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    ty6Var.b(new v9h(j2, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (obj instanceof Double) {
                                        String strValueOf3 = String.valueOf(obj);
                                        qc0.p(ks0.m(new StringBuilder(str2.length() + 28 + strValueOf3.length()), "Cannot serialize override ", str2, ": ", strValueOf3));
                                        throw th;
                                    }
                                    ty6Var.b(new v9h(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c2 = c;
                                th2 = th;
                                i = 1;
                            } else {
                                th = th2;
                                c = c2;
                            }
                            j = 0;
                            j2 = j;
                            if (j2 == j) {
                                str = str2;
                            } else {
                                str = th;
                            }
                            if (obj instanceof String) {
                                ty6Var.b(new v9h(j2, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                ty6Var.b(new v9h(j2, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                ty6Var.b(new v9h(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                ty6Var.b(new v9h(j2, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (obj instanceof Double) {
                                    String strValueOf4 = String.valueOf(obj);
                                    qc0.p(ks0.m(new StringBuilder(str2.length() + 28 + strValueOf4.length()), "Cannot serialize override ", str2, ": ", strValueOf4));
                                    throw th;
                                }
                                ty6Var.b(new v9h(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c2 = c;
                            th2 = th;
                            i = 1;
                        }
                        w9hVar2 = new w9h(ty6Var.i());
                        break;
                    }
                    v9h v9hVar = (v9h) ey6Var.next();
                    Object obj2 = v9hVar.b;
                    long j3 = v9hVar.a;
                    Object objRemove = map.remove(obj2 == null ? Long.toString(j3) : obj2);
                    if (objRemove == null) {
                        ty6Var.b(v9hVar);
                    } else if (objRemove instanceof String) {
                        ty6Var.b(new v9h(v9hVar.a, v9hVar.b, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        ty6Var.b(new v9h(v9hVar.a, v9hVar.b, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        ty6Var.b(new v9h(v9hVar.a, v9hVar.b, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        ty6Var.b(new v9h(v9hVar.a, v9hVar.b, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = v9hVar.b;
                            string = string == null ? Long.toString(j3) : string;
                            String string2 = objRemove.toString();
                            throw new IllegalStateException(ks0.m(new StringBuilder(String.valueOf(string).length() + 46 + string2.length()), "Cannot serialize override for existing flag ", string, ": ", string2));
                        }
                        ty6Var.b(new v9h(v9hVar.a, v9hVar.b, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((gpb) w9hVar2.a).g.size() + 3;
        ynb.D(size, "expectedSize");
        os osVar = new os(size);
        gff it2 = w9hVar2.a.iterator();
        while (true) {
            ey6 ey6Var2 = (ey6) it2;
            if (!ey6Var2.hasNext()) {
                osVar.q("__phenotype_server_token", u9hVar.t());
                osVar.q("__phenotype_snapshot_token", u9hVar.r());
                osVar.q("__phenotype_configuration_version", Long.valueOf(u9hVar.u()));
                this.d = osVar.e(false);
                this.e = h71Var;
                return;
            }
            v9h v9hVar2 = (v9h) ey6Var2.next();
            String string3 = v9hVar2.b;
            if (string3 == null) {
                string3 = Long.toString(v9hVar2.a);
            }
            osVar.q(string3, v9hVar2.a());
        }
    }

    public static int d(t81 t81Var, int i) {
        int iHashCode = t81Var.b.hashCode() + (t81Var.a * 31);
        sp3 sp3Var = t81Var.e;
        if (i >= 2) {
            return sp3Var.hashCode() + (iHashCode * 31);
        }
        byte[] bArr = (byte[]) sp3Var.b.get("exo_len");
        long j = bArr != null ? ByteBuffer.wrap(bArr).getLong() : -1L;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public static t81 f(int i, DataInputStream dataInputStream) throws IOException {
        sp3 sp3VarX0;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            ja8 ja8Var = new ja8();
            ja8Var.a(Long.valueOf(j), "exo_len");
            sp3VarX0 = sp3.c.a(ja8Var);
        } else {
            sp3VarX0 = hbc.x0(dataInputStream);
        }
        return new t81(i2, utf, sp3VarX0);
    }

    public void a() {
        synchronized (((a81) this.e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            ieg.b((wkd) this.c);
            try {
                ((zi0) this.b).a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.u81
    public void b(HashMap map) throws Throwable {
        a90 a90Var = (a90) this.d;
        DataOutputStream dataOutputStream = null;
        try {
            th0 th0VarW = a90Var.W();
            e0c e0cVar = (e0c) this.e;
            if (e0cVar == null) {
                this.e = new e0c(th0VarW);
            } else {
                e0cVar.b(th0VarW);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((e0c) this.e);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iD = 0;
                for (t81 t81Var : map.values()) {
                    dataOutputStream2.writeInt(t81Var.a);
                    dataOutputStream2.writeUTF(t81Var.b);
                    hbc.U0(t81Var.e, dataOutputStream2);
                    iD += d(t81Var, 2);
                }
                dataOutputStream2.writeInt(iD);
                dataOutputStream2.close();
                ((File) a90Var.c).delete();
                String str = pqf.a;
                this.a = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                pqf.f(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.u81
    public void c(t81 t81Var, boolean z) {
        this.a = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e(w84 w84Var, AndroidComposeView androidComposeView, boolean z) {
        int i;
        byte b;
        int i2;
        int i3;
        pl6 pl6Var = (pl6) this.c;
        sl6 sl6Var = (sl6) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            egh eghVarJ = ((mjg) this.d).J(w84Var, androidComposeView);
            gg8 gg8Var = (gg8) eghVarJ.c;
            int iG = gg8Var.g();
            while (true) {
                if (i >= iG) {
                    b = true;
                    break;
                }
                oia oiaVar = (oia) gg8Var.h(i);
                i = (oiaVar.d || oiaVar.h) ? 0 : i + 1;
                b = false;
                break;
            }
            int iG2 = gg8Var.g();
            for (int i4 = 0; i4 < iG2; i4++) {
                oia oiaVar2 = (oia) gg8Var.h(i4);
                if (b != false || xo1.l(oiaVar2)) {
                    ((LayoutNode) this.b).M(oiaVar2.c, sl6Var, oiaVar2.i, true);
                    if (!sl6Var.a.d()) {
                        pl6Var.a(oiaVar2.a, sl6Var, xo1.l(oiaVar2));
                        sl6Var.clear();
                    }
                }
            }
            boolean zB = pl6Var.b(eghVarJ, z);
            if (eghVarJ.b) {
                i2 = 0;
                break;
            }
            int iG3 = gg8Var.g();
            int i5 = 0;
            while (true) {
                if (i5 >= iG3) {
                    i2 = 0;
                    break;
                }
                oia oiaVar3 = (oia) gg8Var.h(i5);
                if (!hl9.c(xo1.H(oiaVar3, true), 0L) && oiaVar3.c()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iG4 = gg8Var.g();
            for (int i6 = 0; i6 < iG4; i6++) {
                if (((oia) gg8Var.h(i6)).c()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.a = false;
        }
    }

    public synchronized void g() {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((jv) this.c).b(context);
                context.unregisterComponentCallbacks((gs) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.u81
    public void j(t81 t81Var) {
        this.a = true;
    }

    @Override // defpackage.u81
    public boolean k() {
        a90 a90Var = (a90) this.d;
        return ((File) a90Var.b).exists() || ((File) a90Var.c).exists();
    }

    @Override // defpackage.u81
    public void l(HashMap map) throws Throwable {
        if (this.a) {
            b(map);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    @Override // defpackage.u81
    public void q(HashMap map, SparseArray sparseArray) throws Throwable {
        DataInputStream dataInputStream;
        pa7.J(!this.a);
        Cipher cipher = (Cipher) this.b;
        a90 a90Var = (a90) this.d;
        File file = (File) a90Var.b;
        File file2 = (File) a90Var.c;
        if (file.exists() || file2.exists()) {
            DataInputStream dataInputStream2 = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(a90Var.O());
                DataInputStream dataInputStream3 = new DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream3.readInt();
                    if (i < 0 || i > 2) {
                        pqf.f(dataInputStream3);
                    } else {
                        if ((dataInputStream3.readInt() & 1) == 0) {
                            dataInputStream = dataInputStream3;
                        } else if (cipher == null) {
                            pqf.f(dataInputStream3);
                        } else {
                            byte[] bArr = new byte[16];
                            dataInputStream3.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                SecretKeySpec secretKeySpec = (SecretKeySpec) this.c;
                                String str = pqf.a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                        try {
                            int i2 = dataInputStream.readInt();
                            int iD = 0;
                            for (int i3 = 0; i3 < i2; i3++) {
                                t81 t81VarF = f(i, dataInputStream);
                                String str2 = t81VarF.b;
                                map.put(str2, t81VarF);
                                sparseArray.put(t81VarF.a, str2);
                                iD += d(t81VarF, i);
                            }
                            int i4 = dataInputStream.readInt();
                            boolean z = dataInputStream.read() == -1;
                            if (i4 == iD && z) {
                                pqf.f(dataInputStream);
                                return;
                            }
                            pqf.f(dataInputStream);
                        } catch (IOException unused) {
                            dataInputStream2 = dataInputStream;
                            if (dataInputStream2 != null) {
                                pqf.f(dataInputStream2);
                            }
                        } catch (Throwable th) {
                            dataInputStream2 = dataInputStream;
                            th = th;
                            if (dataInputStream2 != null) {
                                pqf.f(dataInputStream2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused2) {
                    dataInputStream2 = dataInputStream3;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream2 = dataInputStream3;
                }
            } catch (IOException unused3) {
            } catch (Throwable th3) {
                th = th3;
            }
            map.clear();
            sparseArray.clear();
            ((File) a90Var.b).delete();
            file2.delete();
        }
    }

    @Override // defpackage.u81
    public void r() {
        a90 a90Var = (a90) this.d;
        ((File) a90Var.b).delete();
        ((File) a90Var.c).delete();
    }

    @Override // defpackage.u81
    public void o(long j) {
    }

    public kv(idh idhVar, h71 h71Var) {
        idh.y().equals(idhVar);
        this.b = idhVar.r();
        this.c = idhVar.s();
        int i = ry6.c;
        Object[] objArr = fpb.w;
        int iW = idhVar.w() + 3;
        ynb.D(iW, "expectedSize");
        os osVar = new os(iW);
        for (kdh kdhVar : idhVar.v()) {
            int iE = kdhVar.E();
            int i2 = iE - 1;
            if (iE == 0) {
                throw null;
            }
            if (i2 == 0) {
                osVar.q(kdhVar.r(), Long.valueOf(kdhVar.s()));
            } else if (i2 == 1) {
                osVar.q(kdhVar.r(), Boolean.valueOf(kdhVar.t()));
            } else if (i2 == 2) {
                osVar.q(kdhVar.r(), Double.valueOf(kdhVar.u()));
            } else if (i2 == 3) {
                osVar.q(kdhVar.r(), kdhVar.v());
            } else if (i2 == 4) {
                osVar.q(kdhVar.r(), kdhVar.w().n());
            }
        }
        osVar.q("__phenotype_server_token", idhVar.t());
        osVar.q("__phenotype_snapshot_token", idhVar.r());
        osVar.q("__phenotype_configuration_version", Long.valueOf(idhVar.u()));
        this.d = osVar.e(false);
        this.e = h71Var;
    }
}
