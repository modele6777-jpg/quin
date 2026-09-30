package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class io4 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ycc b;

    public /* synthetic */ io4(ycc yccVar, int i) {
        this.a = i;
        this.b = yccVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        ycc yccVar = this.b;
        switch (i) {
            case 0:
                yccVar.c("camera_result_cards");
                yccVar.c("camera_result_reversed");
                break;
            case 1:
                yccVar.c("camera_result_cards");
                yccVar.c("camera_result_reversed");
                break;
            case 2:
                yccVar.c("seasonal_camera_result_cards");
                yccVar.c("seasonal_camera_result_reversed");
                break;
            default:
                yccVar.c("camera_result_cards");
                yccVar.c("camera_result_reversed");
                break;
        }
        return wefVar;
    }
}
