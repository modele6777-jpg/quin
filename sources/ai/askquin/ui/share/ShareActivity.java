package ai.askquin.ui.share;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import defpackage.dd2;
import defpackage.dj6;
import defpackage.eb3;
import defpackage.ef8;
import defpackage.fzc;
import defpackage.h1;
import defpackage.had;
import defpackage.hf8;
import defpackage.iad;
import defpackage.jzb;
import defpackage.l2;
import defpackage.lw7;
import defpackage.mx4;
import defpackage.oed;
import defpackage.pa7;
import defpackage.v2c;
import defpackage.v4e;
import defpackage.vpf;
import defpackage.w5d;
import defpackage.wb2;
import defpackage.wj7;
import defpackage.xad;
import defpackage.xh7;
import defpackage.ynb;
import defpackage.z18;
import defpackage.z5d;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ShareActivity extends h1 {
    public static final /* synthetic */ int T0 = 0;
    public final lw7 Q0 = eb3.N(z18.c, new wj7(17, this));
    public String R0;
    public Bitmap S0;

    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    @Override // defpackage.h1, defpackage.nx5, defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object objB;
        iad hadVar;
        xad xadVar;
        Object next;
        Object objB2;
        super.onCreate(bundle);
        boolean zHasExtra = getIntent().hasExtra("drawn_cards");
        ef8 ef8Var = hf8.Q;
        if (zHasExtra) {
            Intent intent = getIntent();
            intent.getClass();
            String stringExtra = intent.getStringExtra("drawn_cards");
            if (stringExtra == null) {
                objB2 = null;
            } else {
                try {
                    xh7 xh7Var = fzc.a;
                    xh7Var.getClass();
                    objB2 = xh7Var.b(SharePayload$DrawnCards.Companion.serializer(), stringExtra);
                } catch (Exception unused) {
                    ef8Var.getClass();
                    ef8.a("ShareActivity").b("Failed to parse divination: ".concat(stringExtra));
                    objB2 = null;
                }
            }
            hadVar = (iad) objB2;
        } else {
            Intent intent2 = getIntent();
            intent2.getClass();
            String stringExtra2 = intent2.getStringExtra("divination");
            if (stringExtra2 == null) {
                objB = null;
            } else {
                try {
                    xh7 xh7Var2 = fzc.a;
                    xh7Var2.getClass();
                    objB = xh7Var2.b(SharedDivination.Companion.serializer(), stringExtra2);
                } catch (Exception unused2) {
                    ef8Var.getClass();
                    ef8.a("ShareActivity").b("Failed to parse divination: ".concat(stringExtra2));
                    objB = null;
                }
            }
            SharedDivination sharedDivination = (SharedDivination) objB;
            hadVar = sharedDivination != null ? new had(sharedDivination) : null;
        }
        iad iadVar = hadVar;
        if (iadVar == null) {
            finish();
            return;
        }
        oed oedVar = (oed) dj6.M(getIntent(), "default_share_type", oed.class);
        if (oedVar == null) {
            oedVar = oed.Long;
        }
        oed oedVar2 = oedVar;
        String stringExtra3 = getIntent().getStringExtra("share_source");
        if (stringExtra3 != null) {
            mx4 mx4Var = xad.g;
            mx4Var.getClass();
            l2 l2Var = new l2(0, mx4Var);
            do {
                if (!l2Var.hasNext()) {
                    next = null;
                    break;
                }
                next = l2Var.next();
            } while (!pa7.t(((xad) next).name(), stringExtra3));
            xadVar = (xad) next;
            if (xadVar == null) {
                xadVar = xad.ShareButton;
            }
        } else {
            xadVar = xad.ShareButton;
        }
        xad xadVar2 = xadVar;
        String stringExtra4 = getIntent().getStringExtra("share_scene");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        if (v4e.Q(stringExtra4)) {
            stringExtra4 = "reading_general";
        }
        String str = stringExtra4;
        boolean z = iadVar instanceof SharePayload$DrawnCards;
        xad xadVar3 = xad.Screenshot;
        if (z) {
            SharePayload$DrawnCards sharePayload$DrawnCards = (SharePayload$DrawnCards) iadVar;
            if (v4e.Q(sharePayload$DrawnCards.getDivinationId()) || sharePayload$DrawnCards.getCards().isEmpty()) {
                finish();
                return;
            } else {
                w(iadVar, xadVar3, str);
                return;
            }
        }
        String stringExtra5 = getIntent().getStringExtra("screenshot_path");
        this.R0 = stringExtra5;
        if (stringExtra5 != null) {
            ynb.V(vpf.H(this), null, null, new z5d(this, iadVar, oedVar2, xadVar2, str, null), 3);
        } else if (xadVar2 == xadVar3) {
            finish();
        } else {
            w(iadVar, xadVar2, str);
        }
    }

    @Override // defpackage.h1, defpackage.y70, defpackage.nx5, android.app.Activity
    public final void onDestroy() {
        String str;
        super.onDestroy();
        Bitmap bitmap = this.S0;
        if (bitmap != null) {
            jzb.m(bitmap);
        }
        this.S0 = null;
        if (!isFinishing() || (str = this.R0) == null) {
            return;
        }
        File file = new File(str);
        File file2 = file.isFile() ? file : null;
        if (file2 != null) {
            file2.delete();
        }
    }

    public final void w(iad iadVar, xad xadVar, String str) {
        wb2.a(this, new dd2(new w5d(iadVar, this, v2c.s(xadVar, str), str, 0), true, -2082926744));
    }
}
