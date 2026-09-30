package defpackage;

import ai.askquin.ui.web.WebViewActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ihf extends h36 implements x16 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ihf(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Object value;
        int i = this.a;
        boolean z = true;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                mhf mhfVar = (mhf) this.receiver;
                s0e s0eVar = mhfVar.S0;
                jhf jhfVar = (jhf) s0eVar.getValue();
                if (jhfVar.f && !jhfVar.g && !mhfVar.q() && !jhfVar.h) {
                    do {
                        value = s0eVar.getValue();
                    } while (!s0eVar.l(value, jhf.a((jhf) value, null, null, false, false, false, true, 127)));
                    mhfVar.f(new lhf(mhfVar, null));
                }
                return wefVar;
            case 1:
                qmf qmfVar = (qmf) this.receiver;
                String string = qmfVar.g.d().c.toString();
                int i2 = elf.a[qmfVar.g().ordinal()];
                if (i2 == 1) {
                    ynb.V(hwf.a(qmfVar), null, null, new xlf(qmfVar, string, null), 3);
                } else if (i2 == 2) {
                    ynb.V(hwf.a(qmfVar), null, null, new ylf(qmfVar, string, null), 3);
                }
                return wefVar;
            case 2:
                ((qmf) this.receiver).f.setValue(Boolean.FALSE);
                return wefVar;
            case 3:
                ((WebViewActivity) this.receiver).finish();
                return wefVar;
            case 4:
                ((bq9) this.receiver).a();
                return wefVar;
            case 5:
                c3g c3gVar = (c3g) this.receiver;
                vz9 vz9Var = c3gVar.c;
                if (((Boolean) vz9Var.getValue()).booleanValue()) {
                    z = false;
                } else {
                    Boolean bool = Boolean.TRUE;
                    vz9Var.setValue(bool);
                    c3gVar.d.setValue(bool);
                }
                return Boolean.valueOf(z);
            default:
                ((bq9) this.receiver).a();
                return wefVar;
        }
    }
}
