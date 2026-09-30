package defpackage;

import java.util.function.UnaryOperator;
import tech.chatmind.api.DeviceTokenRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w74 {
    public static final a84 a = new a84(lw2.a, new gl(2, (d56) new ace(new v74(0)).getValue(), d56.class, "updateDeviceToken", "updateDeviceToken(Ltech/chatmind/api/DeviceTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10), new to3(7));

    public static void a(wh9 wh9Var) {
        String strA = wh9Var.a();
        final a84 a84Var = a;
        a84Var.getClass();
        strA.getClass();
        a84Var.e.set(strA);
        final DeviceTokenRequest deviceTokenRequest = new DeviceTokenRequest((String) null, strA, 1, (rp3) null);
        a84Var.f.updateAndGet(new UnaryOperator() { // from class: x74
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                DeviceTokenRequest deviceTokenRequest2 = (DeviceTokenRequest) obj;
                DeviceTokenRequest deviceTokenRequest3 = deviceTokenRequest;
                String aliyunDeviceId = deviceTokenRequest3.getAliyunDeviceId();
                String permission = null;
                if (aliyunDeviceId == null) {
                    aliyunDeviceId = deviceTokenRequest2 != null ? deviceTokenRequest2.getAliyunDeviceId() : null;
                }
                String permission2 = (String) a84Var.e.get();
                if (permission2 != null || (permission2 = deviceTokenRequest3.getPermission()) != null) {
                    permission = permission2;
                } else if (deviceTokenRequest2 != null) {
                    permission = deviceTokenRequest2.getPermission();
                }
                return new DeviceTokenRequest(aliyunDeviceId, permission);
            }
        });
        ynb.V(a84Var.a, null, null, new z74(a84Var, null), 3);
    }
}
