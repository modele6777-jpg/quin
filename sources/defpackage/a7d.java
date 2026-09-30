package defpackage;

import ai.askquin.ui.share.SharedDivination;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a7d implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ihb b;
    public final /* synthetic */ SharedDivination c;
    public final /* synthetic */ x6d d;
    public final /* synthetic */ String e;

    public /* synthetic */ a7d(ihb ihbVar, SharedDivination sharedDivination, x6d x6dVar, String str, int i) {
        this.a = i;
        this.b = ihbVar;
        this.c = sharedDivination;
        this.d = x6dVar;
        this.e = str;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.e;
        x6d x6dVar = this.d;
        SharedDivination sharedDivination = this.c;
        ihb ihbVar = this.b;
        switch (i) {
            case 0:
                String divinationId = sharedDivination.getDivinationId();
                str.getClass();
                ihbVar.f(divinationId, x6dVar, str);
                break;
            default:
                String divinationId2 = sharedDivination.getDivinationId();
                str.getClass();
                ihbVar.f(divinationId2, x6dVar, str);
                break;
        }
        return wefVar;
    }
}
