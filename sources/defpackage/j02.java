package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j02 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ List d;
    public final /* synthetic */ e89 e;
    public final /* synthetic */ e89 f;
    public final /* synthetic */ e89 g;
    public final /* synthetic */ e89 h;
    public final /* synthetic */ gh6 i;
    public final /* synthetic */ aw2 j;
    public final /* synthetic */ jx k;
    public final /* synthetic */ a26 l;

    public /* synthetic */ j02(boolean z, Integer num, List list, e89 e89Var, e89 e89Var2, e89 e89Var3, e89 e89Var4, gh6 gh6Var, aw2 aw2Var, jx jxVar, a26 a26Var, int i) {
        this.a = i;
        this.b = z;
        this.c = num;
        this.d = list;
        this.e = e89Var;
        this.f = e89Var2;
        this.g = e89Var3;
        this.h = e89Var4;
        this.i = gh6Var;
        this.j = aw2Var;
        this.k = jxVar;
        this.l = a26Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        switch (this.a) {
            case 0:
                return ffe.e(tiaVar, null, null, null, new i02(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, 0), xn2Var, 7);
            default:
                return ffe.e(tiaVar, null, null, null, new i02(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, 1), xn2Var, 7);
        }
    }
}
