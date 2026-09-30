package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k7g extends WindowInsetsAnimation$Callback {
    public final h72 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public k7g(h72 h72Var) {
        super(h72Var.a);
        this.d = new HashMap();
        this.a = h72Var;
    }

    public final n7g a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        n7g n7gVar = (n7g) map.get(windowInsetsAnimation);
        if (n7gVar != null) {
            return n7gVar;
        }
        n7g n7gVar2 = new n7g(0, null, 0L);
        n7gVar2.a = new l7g(windowInsetsAnimation);
        map.put(windowInsetsAnimation, n7gVar2);
        return n7gVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            n7g n7gVarA = a(windowInsetsAnimation);
            n7gVarA.a.e(windowInsetsAnimation.getFraction());
            this.c.add(n7gVarA);
        }
        return this.a.f(h8g.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        lqb lqbVarG = this.a.g(a(windowInsetsAnimation), new lqb(bounds));
        lqbVarG.getClass();
        oo.c();
        return oo.a(((x47) lqbVarG.b).d(), ((x47) lqbVarG.c).d());
    }
}
