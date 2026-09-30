package androidx.camera.camera2;

import defpackage.bs9;
import defpackage.k79;
import defpackage.no0;
import defpackage.sk1;
import defpackage.tf1;
import defpackage.tk1;
import defpackage.uk1;
import defpackage.yc1;
import defpackage.z7c;
import defpackage.zc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/camera/camera2/Camera2Config$DefaultProvider", "Ltk1;", "<init>", "()V", "Luk1;", "getCameraXConfig", "()Luk1;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class Camera2Config$DefaultProvider implements tk1 {
    @Override // defpackage.tk1
    public uk1 getCameraXConfig() {
        tf1 tf1Var = new tf1();
        sk1 sk1Var = new sk1(0);
        no0 no0Var = uk1.b;
        k79 k79Var = sk1Var.b;
        k79Var.p(no0Var, tf1Var);
        k79Var.p(uk1.c, new yc1());
        k79Var.p(uk1.d, new zc1());
        k79Var.p(uk1.z, Boolean.TRUE);
        return new uk1(bs9.d(k79Var));
    }
}
