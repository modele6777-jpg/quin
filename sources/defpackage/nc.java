package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.a;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((cd) obj).b();
                break;
            case 1:
                si siVar = (si) obj;
                if (view == siVar.h && (message3 = siVar.j) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == siVar.k && (message2 = siVar.m) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == siVar.n && (message = siVar.p) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                siVar.D.obtainMessage(1, siVar.b).sendToTarget();
                break;
            default:
                oze ozeVar = ((Toolbar) obj).d1;
                vr8 vr8Var = ozeVar != null ? ozeVar.b : null;
                if (vr8Var != null) {
                    vr8Var.collapseActionView();
                }
                break;
        }
    }
}
