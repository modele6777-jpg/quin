package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s38 implements bga {
    public final View a;
    public final k47 b;
    public r38 e;
    public cre f;
    public rvf g;
    public Rect l;
    public final l28 m;
    public a26 c = new tb7(21);
    public a26 d = new tb7(22);
    public zse h = new zse(4, eue.b, "");
    public rx6 i = rx6.g;
    public final ArrayList j = new ArrayList();
    public final lw7 k = eb3.N(z18.c, new zv6(11, this));

    public s38(View view, vs vsVar, k47 k47Var) {
        this.a = view;
        this.b = k47Var;
        this.m = new l28(vsVar, k47Var);
    }

    @Override // defpackage.bga
    public final InputConnection a(EditorInfo editorInfo) {
        zse zseVar = this.h;
        kn2.d0(editorInfo, zseVar.a.b, zseVar.b, this.i, null);
        g38 g38Var = h38.a;
        if (jt4.d()) {
            jt4.a().i(editorInfo);
        }
        ekb ekbVar = new ekb(this.h, new kb6(20, this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(ekbVar));
        return ekbVar;
    }
}
