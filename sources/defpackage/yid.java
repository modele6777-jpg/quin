package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yid {
    public static final HashSet j = new HashSet();
    public final File a;
    public final d28 b;
    public final hbc c;
    public final a90 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public w71 i;

    public yid(File file, d28 d28Var, myd mydVar) {
        kv kvVar;
        boolean zAdd;
        hbc hbcVar = new hbc();
        hbcVar.a = new HashMap();
        hbcVar.b = new SparseArray();
        hbcVar.c = new SparseBooleanArray();
        hbcVar.d = new SparseBooleanArray();
        szc szcVar = new szc(mydVar);
        if (file != null) {
            File file2 = new File(file, "cached_content_index.exi");
            kvVar = new kv();
            kvVar.b = null;
            kvVar.c = null;
            kvVar.d = new a90(file2);
        } else {
            kvVar = null;
        }
        hbcVar.e = szcVar;
        hbcVar.f = kvVar;
        a90 a90Var = new a90(1, mydVar);
        synchronized (yid.class) {
            zAdd = j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            yg5.r(file, "Another SimpleCache instance uses the folder: ");
            throw null;
        }
        this.a = file;
        this.b = d28Var;
        this.c = hbcVar;
        this.d = a90Var;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new xid(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void d(File file) throws w71 {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        xo1.x("SimpleCache", str);
        throw new w71(str);
    }

    public final void a(zid zidVar) {
        String str = zidVar.a;
        this.c.Z(str).c.add(zidVar);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((d28) arrayList.get(size)).b(this, zidVar);
            }
        }
        this.b.b(this, zidVar);
    }

    public final synchronized void b(String str, ja8 ja8Var) {
        c();
        hbc hbcVar = this.c;
        t81 t81VarZ = hbcVar.Z(str);
        sp3 sp3Var = t81VarZ.e;
        sp3 sp3VarA = sp3Var.a(ja8Var);
        t81VarZ.e = sp3VarA;
        if (!sp3VarA.equals(sp3Var)) {
            ((u81) hbcVar.e).j(t81VarZ);
        }
        try {
            this.c.M0();
        } catch (IOException e) {
            throw new w71(e);
        }
    }

    public final synchronized void c() {
        w71 w71Var = this.i;
        if (w71Var != null) {
            throw w71Var;
        }
    }

    public final synchronized sp3 e(String str) {
        t81 t81VarV;
        t81VarV = this.c.V(str);
        return t81VarV != null ? t81VarV.e : sp3.c;
    }

    public final void f() {
        long jAbs;
        hbc hbcVar = this.c;
        File file = this.a;
        if (!file.exists()) {
            try {
                d(file);
            } catch (w71 e) {
                this.i = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            xo1.x("SimpleCache", str);
            this.i = new w71(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jAbs = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    jAbs = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    xo1.x("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        this.h = jAbs;
        if (jAbs == -1) {
            try {
                long jNextLong = new SecureRandom().nextLong();
                jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
                File file3 = new File(file, tec.l(Long.toString(jAbs, 16), ".uid"));
                if (!file3.createNewFile()) {
                    s8f.p(file3, "Failed to create UID file: ");
                    jAbs = 0;
                }
                this.h = jAbs;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                xo1.y("SimpleCache", str2, e2);
                this.i = new w71(str2, e2);
                return;
            }
        }
        try {
            hbcVar.c0(jAbs);
            a90 a90Var = this.d;
            if (a90Var != null) {
                a90Var.G(this.h);
                HashMap mapE = a90Var.E();
                g(file, true, fileArrListFiles, mapE);
                a90Var.R(mapE.keySet());
            } else {
                g(file, true, fileArrListFiles, null);
            }
            gff it = ry6.n(((HashMap) hbcVar.a).keySet()).iterator();
            while (it.hasNext()) {
                hbcVar.r0((String) it.next());
            }
            try {
                hbcVar.M0();
            } catch (IOException e3) {
                xo1.y("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            xo1.y("SimpleCache", str3, e4);
            this.i = new w71(str3, e4);
        }
    }

    public final void g(File file, boolean z, File[] fileArr, Map map) {
        long j2;
        long j3;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                g(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                j81 j81Var = map != null ? (j81) map.remove(name) : null;
                if (j81Var != null) {
                    j2 = j81Var.a;
                    j3 = j81Var.b;
                } else {
                    j2 = -1;
                    j3 = -9223372036854775807L;
                }
                zid zidVarB = zid.b(file2, j2, j3, this.c);
                if (zidVarB != null) {
                    a(zidVarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void h(zid zidVar) {
        t81 t81VarV = this.c.V(zidVar.a);
        t81VarV.getClass();
        long j2 = zidVar.b;
        ArrayList arrayList = t81VarV.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((s81) arrayList.get(i)).a == j2) {
                arrayList.remove(i);
                this.c.r0(t81VarV.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final void i(zid zidVar) {
        String str = zidVar.a;
        long j2 = zidVar.c;
        File file = zidVar.e;
        hbc hbcVar = this.c;
        t81 t81VarV = hbcVar.V(str);
        if (t81VarV == null || !t81VarV.c.remove(zidVar)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        a90 a90Var = this.d;
        if (a90Var != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) a90Var.c).getClass();
                try {
                    ((myd) a90Var.b).getWritableDatabase().delete((String) a90Var.c, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new td3(e);
                }
            } catch (IOException unused) {
                ks0.v("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        hbcVar.r0(t81VarV.b);
        ArrayList arrayList = (ArrayList) this.e.get(zidVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d28 d28Var = (d28) arrayList.get(size);
                d28Var.b.remove(zidVar);
                d28Var.c -= j2;
            }
        }
        d28 d28Var2 = this.b;
        d28Var2.b.remove(zidVar);
        d28Var2.c -= j2;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            for (zid zidVar : ((t81) it.next()).c) {
                File file = zidVar.e;
                file.getClass();
                if (file.length() != zidVar.c) {
                    arrayList.add(zidVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            i((zid) arrayList.get(i));
        }
    }

    public final synchronized zid k(String str, long j2, long j3) {
        long j4;
        zid zidVarB;
        c();
        t81 t81VarV = this.c.V(str);
        if (t81VarV != null) {
            j4 = j2;
            while (true) {
                zidVarB = t81VarV.b(j4, j3);
                if (!zidVarB.d) {
                    break;
                }
                File file = zidVarB.e;
                file.getClass();
                if (file.length() == zidVarB.c) {
                    break;
                }
                j();
            }
        } else {
            j4 = j2;
            zidVarB = new zid(str, j4, j3, -9223372036854775807L, null);
        }
        if (zidVarB.d) {
            return l(str, zidVarB);
        }
        t81 t81VarZ = this.c.Z(str);
        long j5 = zidVarB.c;
        ArrayList arrayList = t81VarZ.d;
        for (int i = 0; i < arrayList.size(); i++) {
            s81 s81Var = (s81) arrayList.get(i);
            long j6 = s81Var.a;
            if (j6 <= j4) {
                long j7 = s81Var.b;
                if (j7 == -1 || j6 + j7 > j4) {
                    return null;
                }
            } else {
                if (j5 == -1 || j4 + j5 > j6) {
                    return null;
                }
            }
        }
        arrayList.add(new s81(j4, j5));
        return zidVarB;
    }

    public final zid l(String str, zid zidVar) {
        boolean z;
        File file;
        long j2 = zidVar.c;
        File file2 = zidVar.e;
        if (!this.g) {
            return zidVar;
        }
        file2.getClass();
        String name = file2.getName();
        long j3 = zidVar.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        a90 a90Var = this.d;
        if (a90Var != null) {
            try {
                a90Var.U(name, j3, jCurrentTimeMillis);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                xo1.V("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        t81 t81VarV = this.c.V(str);
        t81VarV.getClass();
        TreeSet treeSet = t81VarV.c;
        pa7.J(treeSet.remove(zidVar));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = zid.c(parentFile, t81VarV.a, zidVar.b, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                xo1.V("CachedContent", "Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        pa7.J(zidVar.d);
        zid zidVar2 = new zid(zidVar.a, zidVar.b, zidVar.c, jCurrentTimeMillis, file);
        treeSet.add(zidVar2);
        ArrayList arrayList = (ArrayList) this.e.get(zidVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d28 d28Var = (d28) arrayList.get(size);
                d28Var.b.remove(zidVar);
                d28Var.c -= j2;
                d28Var.b(this, zidVar2);
            }
        }
        d28 d28Var2 = this.b;
        d28Var2.b.remove(zidVar);
        d28Var2.c -= j2;
        d28Var2.b(this, zidVar2);
        return zidVar2;
    }
}
