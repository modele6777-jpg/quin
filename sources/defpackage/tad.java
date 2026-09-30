package defpackage;

import android.graphics.BitmapFactory;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tad extends gbe implements l26 {
    final /* synthetic */ String $path;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tad(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$path = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tad(this.$path, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String str = this.$path;
        if (str != null) {
            File file = new File(str);
            if (!file.isFile()) {
                file = null;
            }
            if (file != null) {
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
        }
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tad) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
