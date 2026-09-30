package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ipd {
    public static final qu g = new qu(23);
    public static final qu h = new qu(24);
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;

    public ipd(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.a = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }

    public void a(int i, float f) {
        hpd hpdVar;
        hpd[] hpdVarArr = (hpd[]) this.f;
        int i2 = this.b;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.b = 1;
        }
        int i3 = this.e;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.e = i4;
            hpdVar = hpdVarArr[i4];
        } else {
            hpdVar = new hpd();
        }
        int i5 = this.c;
        this.c = i5 + 1;
        hpdVar.a = i5;
        hpdVar.b = i;
        hpdVar.c = f;
        arrayList.add(hpdVar);
        this.d += i;
        while (true) {
            int i6 = this.d;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            hpd hpdVar2 = (hpd) arrayList.get(0);
            int i8 = hpdVar2.b;
            if (i8 <= i7) {
                this.d -= i8;
                arrayList.remove(0);
                int i9 = this.e;
                if (i9 < 5) {
                    this.e = i9 + 1;
                    hpdVarArr[i9] = hpdVar2;
                }
            } else {
                hpdVar2.b = i8 - i7;
                this.d -= i7;
            }
        }
    }

    public void b() {
        View view = (View) ks0.f(1, this.a);
        hyd hydVar = (hyd) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.f).q.d(view);
        hydVar.getClass();
    }

    public void c() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int d() {
        boolean z = ((StaggeredGridLayoutManager) this.f).v;
        ArrayList arrayList = this.a;
        return z ? f(arrayList.size() - 1, -1) : f(0, arrayList.size());
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.f).v;
        ArrayList arrayList = this.a;
        return z ? f(0, arrayList.size()) : f(arrayList.size() - 1, -1);
    }

    public int f(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        int iM = staggeredGridLayoutManager.q.m();
        int i3 = staggeredGridLayoutManager.q.i();
        int i4 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int iG = staggeredGridLayoutManager.q.g(view);
            int iD = staggeredGridLayoutManager.q.d(view);
            boolean z = iG <= i3;
            boolean z2 = iD >= iM;
            if (z && z2 && (iG < iM || iD > i3)) {
                return tkb.B(view);
            }
            i += i4;
        }
        return -1;
    }

    public int g(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        b();
        return this.c;
    }

    public View h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        View view = null;
        ArrayList arrayList = this.a;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.v && tkb.B(view2) >= i) || ((!staggeredGridLayoutManager.v && tkb.B(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.v && tkb.B(view3) <= i) || ((!staggeredGridLayoutManager.v && tkb.B(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public float i() {
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.b = 0;
        }
        float f = 0.5f * this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hpd hpdVar = (hpd) arrayList.get(i3);
            i2 += hpdVar.b;
            if (i2 >= f) {
                return hpdVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((hpd) ks0.f(1, arrayList)).c;
    }

    public int j(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        hyd hydVar = (hyd) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.f).q.g(view);
        hydVar.getClass();
        return this.b;
    }

    public ipd() {
        this.f = new hpd[5];
        this.a = new ArrayList();
        this.b = -1;
    }
}
