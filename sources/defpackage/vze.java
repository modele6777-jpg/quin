package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vze extends vwf {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public vze(twf twfVar) {
        this.a = 1;
        this.d = twfVar;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.vwf, defpackage.uwf
    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.vwf, defpackage.uwf
    public final void b() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((wze) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    uwf uwfVar = ((twf) obj).d;
                    if (uwfVar != null) {
                        uwfVar.b();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.uwf
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((wze) obj).a.setVisibility(this.c);
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                twf twfVar = (twf) obj;
                if (i2 == twfVar.a.size()) {
                    uwf uwfVar = twfVar.d;
                    if (uwfVar != null) {
                        uwfVar.c();
                    }
                    this.c = 0;
                    this.b = false;
                    twfVar.e = false;
                }
                break;
        }
    }

    public vze(wze wzeVar, int i) {
        this.a = 0;
        this.d = wzeVar;
        this.c = i;
        this.b = false;
    }
}
