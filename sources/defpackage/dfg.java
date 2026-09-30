package defpackage;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.a;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dfg extends weg {
    public final int g;
    public final String h;
    public final int i;
    public final /* synthetic */ a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfg(a aVar, gle gleVar, int i, String str, int i2) {
        super(aVar, gleVar);
        this.j = aVar;
        this.g = i;
        this.h = str;
        this.i = i2;
    }

    @Override // defpackage.weg
    public final void M(Bundle bundle) {
        a aVar = this.j;
        aVar.d.d(this.e);
        a.g.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i = this.i;
        if (i > 0) {
            aVar.h(this.g, i - 1, this.h);
        }
    }
}
