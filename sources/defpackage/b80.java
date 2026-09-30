package defpackage;

import android.graphics.Typeface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b80 implements yl2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yl2
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 1:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 2:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            default:
                lq0 lq0Var = (lq0) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i2 = lq0Var.b - ((qp0) entry.getKey()).f;
                    if (((qp0) entry.getKey()).g) {
                        i2 = -i2;
                    }
                    int i3 = s2f.i(i2);
                    iae iaeVar = (iae) entry.getValue();
                    iaeVar.getClass();
                    p8c.v(new gae(iaeVar, i3, -1));
                }
                break;
        }
    }
}
