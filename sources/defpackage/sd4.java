package defpackage;

import ai.askquin.ui.conversation.r0;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ Instant c;
    public final /* synthetic */ String d;
    public final /* synthetic */ dd4 e;

    public /* synthetic */ sd4(r0 r0Var, Instant instant, String str, dd4 dd4Var, int i) {
        this.a = i;
        this.b = r0Var;
        this.c = instant;
        this.d = str;
        this.e = dd4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        dd4 dd4Var = this.e;
        String str = this.d;
        Instant instant = this.c;
        r0 r0Var = this.b;
        String str2 = (String) obj;
        switch (i) {
            case 0:
                str2.getClass();
                r0Var.A1(instant);
                r0Var.X0(new et8(str, str2, false));
                r0Var.K1(new bd4(str2, dd4Var));
                break;
            default:
                str2.getClass();
                r0Var.A1(instant);
                r0Var.X0(new et8(str, str2, true));
                r0Var.K1(new bd4(str2, dd4Var));
                r0Var.g1("reading_done");
                r0Var.R0();
                break;
        }
        return wefVar;
    }
}
