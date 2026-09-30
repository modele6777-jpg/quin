package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum org {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final lug b;
    private final int zzr;

    static {
        os osVar = new os(17, (char) 0);
        osVar.c = new Object[8];
        osVar.b = 0;
        for (org orgVar : values()) {
            Integer numValueOf = Integer.valueOf(orgVar.zzr);
            int i = osVar.b + 1;
            Object[] objArrCopyOf = (Object[]) osVar.c;
            int length = objArrCopyOf.length;
            int i2 = i + i;
            if (i2 > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, q6c.p(length, i2));
                osVar.c = objArrCopyOf;
            }
            int i3 = osVar.b;
            int i4 = i3 + i3;
            objArrCopyOf[i4] = numValueOf;
            objArrCopyOf[i4 + 1] = orgVar;
            osVar.b = i3 + 1;
        }
        otg otgVar = (otg) osVar.d;
        if (otgVar != null) {
            throw otgVar.a();
        }
        lug lugVarB = lug.b(osVar.b, (Object[]) osVar.c, osVar);
        otg otgVar2 = (otg) osVar.d;
        if (otgVar2 != null) {
            throw otgVar2.a();
        }
        b = lugVarB;
    }

    org(int i) {
        this.zzr = i;
    }
}
