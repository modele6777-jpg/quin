package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import com.adjust.sdk.sig.r3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Set;
import tech.chatmind.api.EmotionTheme;
import tech.chatmind.api.message.model.InAppMessageIntensity;
import tech.chatmind.api.message.model.InAppMessageType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ax3 extends oa7 {
    public final /* synthetic */ int k;

    public /* synthetic */ ax3(int i) {
        this.k = i;
    }

    @Override // defpackage.oa7
    public final String J() {
        switch (this.k) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR ABORT INTO `divination_summary` (`divinationId`,`theme`,`summary`,`advice`) VALUES (?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `tb_in_app_message` (`message_id`,`message_type`,`region`,`title`,`content`,`image_url`,`intensity`,`action`,`action_tips`,`attach`,`created_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 4:
                return "INSERT OR ABORT INTO `quick_decision` (`id`,`cardKey`,`isReversed`,`answer`,`tagline`,`reading`,`drawnAt`,`chatId`,`syncedAt`,`accountId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 6:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 8:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // defpackage.oa7
    public final void p(x8c x8cVar, Object obj) throws IOException {
        String str;
        int i;
        int i2;
        int[] iArrI1;
        int[] iArrI2;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 5;
        switch (this.k) {
            case 0:
                yw3 yw3Var = (yw3) obj;
                x8cVar.getClass();
                yw3Var.getClass();
                x8cVar.Q(1, yw3Var.a);
                x8cVar.Q(2, yw3Var.b);
                return;
            case 1:
                xc4 xc4Var = (xc4) obj;
                x8cVar.getClass();
                xc4Var.getClass();
                x8cVar.Q(1, xc4Var.a);
                EmotionTheme emotionTheme = xc4Var.b;
                emotionTheme.getClass();
                int i4 = fu4.a[emotionTheme.ordinal()];
                if (i4 == 1) {
                    str = "calm";
                } else if (i4 == 2) {
                    str = "joy";
                } else if (i4 == 3) {
                    str = "worry";
                } else if (i4 == 4) {
                    str = "tension";
                } else {
                    if (i4 != 5) {
                        ap.c();
                        return;
                    }
                    str = "__unknown__";
                }
                x8cVar.Q(2, str);
                x8cVar.Q(3, xc4Var.c);
                x8cVar.Q(4, xc4Var.d);
                return;
            case 2:
                dz6 dz6Var = (dz6) obj;
                x8cVar.getClass();
                dz6Var.getClass();
                x8cVar.Q(1, dz6Var.a);
                InAppMessageType inAppMessageType = dz6Var.b;
                inAppMessageType.getClass();
                x8cVar.Q(2, inAppMessageType.name());
                x8cVar.Q(3, dz6Var.c);
                String str2 = dz6Var.d;
                if (str2 == null) {
                    x8cVar.o(4);
                } else {
                    x8cVar.Q(4, str2);
                }
                x8cVar.Q(5, dz6Var.e);
                String str3 = dz6Var.f;
                if (str3 == null) {
                    x8cVar.o(6);
                } else {
                    x8cVar.Q(6, str3);
                }
                InAppMessageIntensity inAppMessageIntensity = dz6Var.g;
                inAppMessageIntensity.getClass();
                x8cVar.Q(7, inAppMessageIntensity.name());
                String str4 = dz6Var.h;
                if (str4 == null) {
                    x8cVar.o(8);
                } else {
                    x8cVar.Q(8, str4);
                }
                String str5 = dz6Var.i;
                if (str5 == null) {
                    x8cVar.o(9);
                } else {
                    x8cVar.Q(9, str5);
                }
                String str6 = dz6Var.j;
                if (str6 == null) {
                    x8cVar.o(10);
                } else {
                    x8cVar.Q(10, str6);
                }
                DateTimeFormatter dateTimeFormatter = il9.a;
                OffsetDateTime offsetDateTime = dz6Var.k;
                String str7 = offsetDateTime != null ? offsetDateTime.format(il9.a) : null;
                if (str7 == null) {
                    x8cVar.o(11);
                    return;
                } else {
                    x8cVar.Q(11, str7);
                    return;
                }
            case 3:
                zpa zpaVar = (zpa) obj;
                x8cVar.getClass();
                zpaVar.getClass();
                x8cVar.Q(1, zpaVar.a);
                x8cVar.m(2, zpaVar.b.longValue());
                return;
            case 4:
                x6b x6bVar = (x6b) obj;
                x8cVar.getClass();
                x6bVar.getClass();
                x8cVar.m(1, x6bVar.a);
                x8cVar.Q(2, x6bVar.b);
                x8cVar.m(3, x6bVar.c ? 1L : 0L);
                x8cVar.Q(4, x6bVar.d);
                x8cVar.Q(5, x6bVar.e);
                x8cVar.Q(6, x6bVar.f);
                String strM = yx4.m(x6bVar.g);
                if (strM == null) {
                    x8cVar.o(7);
                } else {
                    x8cVar.Q(7, strM);
                }
                x8cVar.Q(8, x6bVar.h);
                String strM2 = yx4.m(x6bVar.i);
                if (strM2 == null) {
                    x8cVar.o(9);
                } else {
                    x8cVar.Q(9, strM2);
                }
                x8cVar.Q(10, x6bVar.j);
                return;
            case 5:
                kce kceVar = (kce) obj;
                x8cVar.getClass();
                kceVar.getClass();
                x8cVar.Q(1, kceVar.a);
                x8cVar.m(2, kceVar.b);
                x8cVar.m(3, kceVar.c);
                return;
            case 6:
                cbg cbgVar = (cbg) obj;
                x8cVar.getClass();
                cbgVar.getClass();
                x8cVar.Q(1, cbgVar.a);
                x8cVar.Q(2, cbgVar.b);
                return;
            case 7:
                ebg ebgVar = (ebg) obj;
                x8cVar.getClass();
                ebgVar.getClass();
                x8cVar.Q(1, ebgVar.a);
                bb3 bb3Var = bb3.b;
                x8cVar.n(bm8.S(ebgVar.b), 2);
                return;
            case 8:
                lbg lbgVar = (lbg) obj;
                x8cVar.getClass();
                lbgVar.getClass();
                x8cVar.Q(1, lbgVar.a);
                x8cVar.m(2, gcc.D(lbgVar.b));
                x8cVar.Q(3, lbgVar.c);
                x8cVar.Q(4, lbgVar.d);
                bb3 bb3Var2 = bb3.b;
                x8cVar.n(bm8.S(lbgVar.e), 5);
                x8cVar.n(bm8.S(lbgVar.f), 6);
                x8cVar.m(7, lbgVar.g);
                x8cVar.m(8, lbgVar.h);
                x8cVar.m(9, lbgVar.i);
                x8cVar.m(10, lbgVar.k);
                us0 us0Var = lbgVar.l;
                us0Var.getClass();
                int iOrdinal = us0Var.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return;
                    }
                    i = 1;
                }
                x8cVar.m(11, i);
                x8cVar.m(12, lbgVar.m);
                x8cVar.m(13, lbgVar.n);
                x8cVar.m(14, lbgVar.o);
                x8cVar.m(15, lbgVar.p);
                x8cVar.m(16, lbgVar.q ? 1L : 0L);
                rs9 rs9Var = lbgVar.r;
                rs9Var.getClass();
                int iOrdinal2 = rs9Var.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 0;
                } else {
                    if (iOrdinal2 != 1) {
                        ap.c();
                        return;
                    }
                    i2 = 1;
                }
                x8cVar.m(17, i2);
                x8cVar.m(18, lbgVar.s);
                x8cVar.m(19, lbgVar.t);
                x8cVar.m(20, lbgVar.u);
                x8cVar.m(21, lbgVar.v);
                x8cVar.m(22, lbgVar.w);
                String str8 = lbgVar.x;
                if (str8 == null) {
                    x8cVar.o(23);
                } else {
                    x8cVar.Q(23, str8);
                }
                Boolean bool = lbgVar.y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    x8cVar.o(24);
                } else {
                    x8cVar.m(24, numValueOf.intValue());
                }
                jl2 jl2Var = lbgVar.j;
                qe9 qe9Var = jl2Var.a;
                int iOrdinal3 = qe9Var.ordinal();
                if (iOrdinal3 == 0) {
                    i3 = 0;
                } else if (iOrdinal3 == 1) {
                    i3 = 1;
                } else if (iOrdinal3 == 2) {
                    i3 = 2;
                } else if (iOrdinal3 == 3) {
                    i3 = 3;
                } else if (iOrdinal3 == 4) {
                    i3 = 4;
                } else if (Build.VERSION.SDK_INT < 30 || qe9Var != qe9.f) {
                    r3.m(qe9Var, " to int", "Could not convert ");
                    i3 = 0;
                }
                x8cVar.m(25, i3);
                be9 be9Var = jl2Var.b;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) be9Var.a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i5 >= 31) {
                                    iArrI1 = xq.C(networkRequest);
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i6 = 0; i6 < 10; i6++) {
                                        int i7 = iArr[i6];
                                        if (s.P(networkRequest, i7)) {
                                            arrayList.add(Integer.valueOf(i7));
                                        }
                                    }
                                    iArrI1 = s72.i1(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrI2 = xq.a(networkRequest);
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i8 = 0; i8 < 30; i8++) {
                                        int i9 = iArr2[i8];
                                        if (s.O(networkRequest, i9)) {
                                            arrayList2.add(Integer.valueOf(i9));
                                        }
                                    }
                                    iArrI2 = s72.i1(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrI1.length);
                                for (int i10 : iArrI1) {
                                    objectOutputStream.writeInt(i10);
                                }
                                objectOutputStream.writeInt(iArrI2.length);
                                for (int i11 : iArrI2) {
                                    objectOutputStream.writeInt(i11);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    ym8.t(objectOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                ym8.t(byteArrayOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
                x8cVar.n(byteArray, 26);
                x8cVar.m(27, jl2Var.c ? 1L : 0L);
                x8cVar.m(28, jl2Var.d ? 1L : 0L);
                x8cVar.m(29, jl2Var.e ? 1L : 0L);
                x8cVar.m(30, jl2Var.f ? 1L : 0L);
                x8cVar.m(31, jl2Var.g);
                x8cVar.m(32, jl2Var.h);
                Set<il2> set = jl2Var.i;
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (il2 il2Var : set) {
                                objectOutputStream2.writeUTF(il2Var.a.toString());
                                objectOutputStream2.writeBoolean(il2Var.b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArray2.getClass();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                ym8.t(objectOutputStream2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            ym8.t(byteArrayOutputStream2, th7);
                            throw th8;
                        }
                    }
                }
                x8cVar.n(byteArray2, 33);
                return;
            default:
                obg obgVar = (obg) obj;
                x8cVar.getClass();
                obgVar.getClass();
                x8cVar.Q(1, obgVar.a);
                x8cVar.Q(2, obgVar.b);
                return;
        }
    }

    public /* synthetic */ ax3(int i, Object obj) {
        this.k = i;
    }
}
