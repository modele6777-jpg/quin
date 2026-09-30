package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nr3 extends rkb {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((flb) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.rkb
    public final boolean a(flb flbVar, flb flbVar2, h71 h71Var, h71 h71Var2) {
        int i;
        int i2;
        int i3 = h71Var.b;
        int i4 = h71Var.c;
        if (flbVar2.n()) {
            int i5 = h71Var.b;
            i2 = h71Var.c;
            i = i5;
        } else {
            i = h71Var2.b;
            i2 = h71Var2.c;
        }
        if (flbVar == flbVar2) {
            return g(flbVar, i3, i4, i, i2);
        }
        View view = flbVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(flbVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = flbVar2.a;
        l(flbVar2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        lr3 lr3Var = new lr3();
        lr3Var.a = flbVar;
        lr3Var.b = flbVar2;
        lr3Var.c = i3;
        lr3Var.d = i4;
        lr3Var.e = i;
        lr3Var.f = i2;
        arrayList.add(lr3Var);
        return true;
    }

    @Override // defpackage.rkb
    public final void d(flb flbVar) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = flbVar.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((mr3) arrayList4.get(size)).a == flbVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(flbVar);
                arrayList4.remove(size);
            }
        }
        j(this.k, flbVar);
        if (this.h.remove(flbVar)) {
            view.setAlpha(1.0f);
            c(flbVar);
        }
        if (this.i.remove(flbVar)) {
            view.setAlpha(1.0f);
            c(flbVar);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, flbVar);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((mr3) arrayList6.get(size4)).a == flbVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(flbVar);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(flbVar)) {
                view.setAlpha(1.0f);
                c(flbVar);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(flbVar);
        this.o.remove(flbVar);
        this.r.remove(flbVar);
        this.p.remove(flbVar);
        i();
    }

    @Override // defpackage.rkb
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            mr3 mr3Var = (mr3) arrayList7.get(size);
            View view = mr3Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(mr3Var.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((flb) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            flb flbVar = (flb) arrayList5.get(size3);
            flbVar.a.setAlpha(1.0f);
            c(flbVar);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            lr3 lr3Var = (lr3) arrayList.get(size4);
            flb flbVar2 = lr3Var.a;
            if (flbVar2 != null) {
                k(lr3Var, flbVar2);
            }
            flb flbVar3 = lr3Var.b;
            if (flbVar3 != null) {
                k(lr3Var, flbVar3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    mr3 mr3Var2 = (mr3) arrayList8.get(size6);
                    View view2 = mr3Var2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(mr3Var2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    flb flbVar4 = (flb) arrayList9.get(size8);
                    flbVar4.a.setAlpha(1.0f);
                    c(flbVar4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    lr3 lr3Var2 = (lr3) arrayList10.get(size10);
                    flb flbVar5 = lr3Var2.a;
                    if (flbVar5 != null) {
                        k(lr3Var2, flbVar5);
                    }
                    flb flbVar6 = lr3Var2.b;
                    if (flbVar6 != null) {
                        k(lr3Var2, flbVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                r3.f();
            }
        }
    }

    @Override // defpackage.rkb
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(flb flbVar, int i, int i2, int i3, int i4) {
        View view = flbVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) flbVar.a.getTranslationY());
        l(flbVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(flbVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        mr3 mr3Var = new mr3();
        mr3Var.a = flbVar;
        mr3Var.b = translationX;
        mr3Var.c = translationY;
        mr3Var.d = i3;
        mr3Var.e = i4;
        arrayList.add(mr3Var);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            r3.f();
        }
    }

    public final void j(ArrayList arrayList, flb flbVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            lr3 lr3Var = (lr3) arrayList.get(size);
            if (k(lr3Var, flbVar) && lr3Var.a == null && lr3Var.b == null) {
                arrayList.remove(lr3Var);
            }
        }
    }

    public final boolean k(lr3 lr3Var, flb flbVar) {
        if (lr3Var.b == flbVar) {
            lr3Var.b = null;
        } else {
            if (lr3Var.a != flbVar) {
                return false;
            }
            lr3Var.a = null;
        }
        View view = flbVar.a;
        View view2 = flbVar.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(flbVar);
        return true;
    }

    public final void l(flb flbVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        flbVar.a.animate().setInterpolator(s);
        d(flbVar);
    }
}
