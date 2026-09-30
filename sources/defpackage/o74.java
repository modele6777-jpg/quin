package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o74 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    public o74(AssetManager assetManager, Executor executor, lwa lwaVar, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = lwaVar;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = vfh.o;
                    break;
                case 27:
                    bArr = vfh.n;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = vfh.m;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = vfh.l;
        }
        this.d = bArr;
    }

    public Integer a(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.g).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        o74 o74Var = (o74) this.e;
        if (o74Var != null) {
            return o74Var.a(i);
        }
        return null;
    }

    public void b(cv7 cv7Var) {
        a82 a82Var = (a82) this.g;
        if (a82Var == null || cv7Var != ((cv7) this.h) || a82Var.e()) {
            this.h = cv7Var;
            a82Var = new a82((k00) this.b, (sw3) this.d, (xp5) this.e, a6c.k((mue) this.c, cv7Var), (List) this.f, this.a);
        }
        this.g = a82Var;
    }

    public FileInputStream c(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((lwa) this.c).m();
            return null;
        }
    }

    public void d(int i, Serializable serializable) {
        ((Executor) this.b).execute(new fe1(this, i, serializable, 3));
    }

    public o74 e(List list) {
        o74 o74Var = new o74((u99) this.b, (bu3) this.c, (otf) this.d, this.a, this, (List) this.f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0b a0bVar = (a0b) it.next();
            ((LinkedHashMap) o74Var.g).put(Integer.valueOf(a0bVar.I()), Integer.valueOf(a0bVar.H()));
        }
        return o74Var;
    }

    public /* synthetic */ o74(u99 u99Var, bu3 bu3Var, otf otfVar, boolean z, List list, int i) {
        this(u99Var, bu3Var, otfVar, z, (o74) null, (i & 32) != 0 ? pu4.a : list);
    }

    public o74(k00 k00Var, sw3 sw3Var, xp5 xp5Var, mue mueVar, List list, boolean z) {
        this.b = k00Var;
        this.c = mueVar;
        this.a = z;
        this.d = sw3Var;
        this.e = xp5Var;
        this.f = list;
    }

    public o74(u99 u99Var, bu3 bu3Var, otf otfVar, boolean z, o74 o74Var, List list) {
        u99Var.getClass();
        bu3Var.getClass();
        otfVar.getClass();
        list.getClass();
        this.b = u99Var;
        this.c = bu3Var;
        this.d = otfVar;
        this.a = z;
        this.e = o74Var;
        this.f = list;
        this.g = new LinkedHashMap();
        wu8.a.getClass();
        this.h = vu8.a();
    }
}
