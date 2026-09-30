package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.share.ShareActivity;
import ai.askquin.ui.share.SharedDivination;
import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class js2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;

    public /* synthetic */ js2(r0 r0Var, Context context, String str, int i) {
        this.a = i;
        this.b = r0Var;
        this.c = context;
        this.d = str;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        final int i2 = 1;
        final Context context = this.c;
        final String str = this.d;
        wef wefVar = wef.a;
        r0 r0Var = this.b;
        switch (i) {
            case 0:
                w6c.x("result", str);
                final int i3 = 0;
                r0Var.T0(new a26() { // from class: ps2
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i4 = i3;
                        wef wefVar2 = wef.a;
                        switch (i4) {
                            case 0:
                                SharedDivination sharedDivination = (SharedDivination) obj;
                                sharedDivination.getClass();
                                int i5 = ShareActivity.T0;
                                jy4.y(context, sharedDivination, xad.ShareButton, str, null, 36);
                                break;
                            default:
                                SharedDivination sharedDivination2 = (SharedDivination) obj;
                                sharedDivination2.getClass();
                                int i6 = ShareActivity.T0;
                                jy4.y(context, sharedDivination2, xad.ShareButton, str, null, 36);
                                break;
                        }
                        return wefVar2;
                    }
                });
                break;
            case 1:
                cm4 cm4VarH = r0Var.H();
                if (cm4VarH != null) {
                    int i4 = ShareActivity.T0;
                    String strE = r0Var.E();
                    List list = cm4VarH.d;
                    List list2 = cm4VarH.c;
                    String str2 = r0Var.C1;
                    if (r0Var.H() == null) {
                        str2 = null;
                    }
                    String str3 = str2;
                    jy4.z(this.c, strE, list, list2, str3, this.d, r0Var.R());
                }
                break;
            case 2:
                w6c.x("result", "reading_long_press");
                r0Var.T0(new a26() { // from class: ps2
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i5 = i2;
                        wef wefVar2 = wef.a;
                        switch (i5) {
                            case 0:
                                SharedDivination sharedDivination = (SharedDivination) obj;
                                sharedDivination.getClass();
                                int i6 = ShareActivity.T0;
                                jy4.y(context, sharedDivination, xad.ShareButton, str, null, 36);
                                break;
                            default:
                                SharedDivination sharedDivination2 = (SharedDivination) obj;
                                sharedDivination2.getClass();
                                int i7 = ShareActivity.T0;
                                jy4.y(context, sharedDivination2, xad.ShareButton, str, null, 36);
                                break;
                        }
                        return wefVar2;
                    }
                });
                break;
            default:
                w6c.x("result", str);
                r0Var.T0(new a26() { // from class: ps2
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i5 = i2;
                        wef wefVar2 = wef.a;
                        switch (i5) {
                            case 0:
                                SharedDivination sharedDivination = (SharedDivination) obj;
                                sharedDivination.getClass();
                                int i6 = ShareActivity.T0;
                                jy4.y(context, sharedDivination, xad.ShareButton, str, null, 36);
                                break;
                            default:
                                SharedDivination sharedDivination2 = (SharedDivination) obj;
                                sharedDivination2.getClass();
                                int i7 = ShareActivity.T0;
                                jy4.y(context, sharedDivination2, xad.ShareButton, str, null, 36);
                                break;
                        }
                        return wefVar2;
                    }
                });
                break;
        }
        return wefVar;
    }

    public /* synthetic */ js2(String str, r0 r0Var, Context context, int i) {
        this.a = i;
        this.d = str;
        this.b = r0Var;
        this.c = context;
    }
}
