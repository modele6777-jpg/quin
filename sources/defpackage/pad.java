package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pad {
    public final g6d a = new g6d();
    public final lsd b = new lsd();
    public final lsd c = new lsd();
    public final lsd d = new lsd();
    public final LinkedHashMap e = new LinkedHashMap();
    public boolean f;

    public final w7d a(int i) {
        g8d g8dVar = (g8d) this.e.get(Integer.valueOf(i));
        if (g8dVar != null) {
            g8dVar.b();
        } else {
            g8dVar = null;
        }
        if (g8dVar != null) {
            return new w7d(g8dVar, null, 2);
        }
        f6d f6dVarA = this.a.a(Integer.valueOf(i));
        if (f6dVarA != null) {
            return new w7d(null, f6dVarA, 1);
        }
        return null;
    }

    public final void b(int i, pad padVar) {
        padVar.getClass();
        g8d g8dVar = (g8d) padVar.e.get(Integer.valueOf(i));
        if (g8dVar != null) {
            g8dVar.b();
            g(i, g8dVar);
        }
    }

    public final void c() {
        this.f = true;
        LinkedHashMap linkedHashMap = this.e;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((g8d) it.next()).a();
        }
        linkedHashMap.clear();
        this.a.b();
    }

    public final boolean d(int i) {
        return i(i) > 0;
    }

    public final boolean e(int i) {
        return pa7.t(this.d.get(Integer.valueOf(i)), Boolean.TRUE);
    }

    public final boolean f(int i) {
        LinkedHashMap linkedHashMap = this.e;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Number) obj).intValue() != i) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g8d g8dVar = (g8d) linkedHashMap.remove(Integer.valueOf(((Number) it.next()).intValue()));
            if (g8dVar != null) {
                g8dVar.a();
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        g6d g6dVar = this.a;
        LinkedHashMap linkedHashMap2 = g6dVar.a;
        if (!g6dVar.c) {
            Set setKeySet2 = linkedHashMap2.keySet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : setKeySet2) {
                if (!pa7.t(obj2, numValueOf)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                e6d e6dVar = (e6d) linkedHashMap2.remove(it2.next());
                if (e6dVar != null) {
                    int i2 = e6dVar.b - 1;
                    e6dVar.b = i2;
                    Bitmap bitmap = e6dVar.a;
                    if (i2 == 0 && e6dVar.c == 0) {
                        g6dVar.b.remove(bitmap);
                        jzb.m(bitmap);
                    }
                }
            }
        }
        lsd lsdVar = this.b;
        rrd rrdVar = lsdVar.c;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = rrdVar.iterator();
        while (((b1e) it3).hasNext()) {
            Object next = ((b1e) it3).next();
            if (((Number) next).intValue() != i) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            lsdVar.remove(Integer.valueOf(((Number) it4.next()).intValue()));
        }
        lsd lsdVar2 = this.c;
        rrd rrdVar2 = lsdVar2.c;
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = rrdVar2.iterator();
        while (((b1e) it5).hasNext()) {
            Object next2 = ((b1e) it5).next();
            if (((Number) next2).intValue() != i) {
                arrayList4.add(next2);
            }
        }
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            lsdVar2.remove(Integer.valueOf(((Number) it6.next()).intValue()));
        }
        lsd lsdVar3 = this.d;
        rrd rrdVar3 = lsdVar3.c;
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = rrdVar3.iterator();
        while (((b1e) it7).hasNext()) {
            Object next3 = ((b1e) it7).next();
            if (((Number) next3).intValue() != i) {
                arrayList5.add(next3);
            }
        }
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            lsdVar3.remove(Integer.valueOf(((Number) it8.next()).intValue()));
        }
        if (d(i)) {
            return true;
        }
        lsdVar2.put(Integer.valueOf(i), mad.a);
        return false;
    }

    public final void g(int i, g8d g8dVar) {
        if (this.f) {
            g8dVar.a();
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        g6d g6dVar = this.a;
        e6d e6dVar = (e6d) g6dVar.a.remove(numValueOf);
        if (e6dVar != null) {
            int i2 = e6dVar.b - 1;
            e6dVar.b = i2;
            Bitmap bitmap = e6dVar.a;
            if (i2 == 0 && e6dVar.c == 0) {
                g6dVar.b.remove(bitmap);
                jzb.m(bitmap);
            }
        }
        g8d g8dVar2 = (g8d) this.e.put(Integer.valueOf(i), g8dVar);
        if (g8dVar2 != null) {
            g8dVar2.a();
        }
        this.b.put(Integer.valueOf(i), Integer.valueOf(i(i) + 1));
    }

    public final void h(int i) {
        this.d.put(Integer.valueOf(i), Boolean.valueOf(!e(i)));
    }

    public final int i(int i) {
        Integer num = (Integer) this.b.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
