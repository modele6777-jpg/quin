package defpackage;

import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.router.AppRoute;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dc9 extends ewf implements hf8 {
    public static final /* synthetic */ int z = 0;
    public final vz9 b = q1c.f(null);
    public final vz9 c = q1c.f(null);
    public String d = Constants.NORMAL;
    public final vz9 e = q1c.f(null);
    public final vz9 f;
    public final vz9 g;
    public final vz9 v;
    public DrawCardSaves w;
    public AppRoute.Conversation x;
    public final vz9 y;

    public dc9() {
        Boolean bool = Boolean.FALSE;
        this.f = q1c.f(bool);
        this.g = q1c.f(bool);
        this.v = q1c.f(bool);
        this.y = q1c.f(bool);
    }

    public final boolean f() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    public final void g(Object obj) {
        obj.getClass();
        this.e.setValue(new k7c(obj));
    }

    public final void h(ir2 ir2Var) {
        this.b.setValue(ir2Var);
    }

    public final void i(boolean z2) {
        this.f.setValue(Boolean.valueOf(z2));
    }
}
