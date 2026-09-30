package defpackage;

import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qd4 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ Operation c;

    public /* synthetic */ qd4(r0 r0Var, Operation operation, int i) {
        this.a = i;
        this.b = r0Var;
        this.c = operation;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        Operation operation = this.c;
        r0 r0Var = this.b;
        switch (i) {
            case 0:
                r0Var.M0(operation);
                break;
            default:
                int i2 = r0.j2;
                r0Var.M0(operation);
                break;
        }
        return wefVar;
    }
}
