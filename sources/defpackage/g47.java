package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g47 extends InputConnectionWrapper {
    public final /* synthetic */ h47 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g47(InputConnection inputConnection, h47 h47Var) {
        super(inputConnection, false);
        this.a = h47Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ssg ssgVar;
        if (inputContentInfo == null) {
            ssgVar = null;
        } else {
            ssgVar = new ssg(21, new mjg(inputContentInfo));
        }
        if (this.a.b(ssgVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
