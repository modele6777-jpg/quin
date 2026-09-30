package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.UUID;
import tech.chatmind.api.RedeemPopupAction;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zlb implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zlb(x16 x16Var, x16 x16Var2, e89 e89Var, e89 e89Var2) {
        this.a = 2;
        this.b = x16Var;
        this.c = x16Var2;
        this.e = e89Var;
        this.d = e89Var2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a26 a26Var = (a26) this.c;
                RedeemPopupAction redeemPopupAction = (RedeemPopupAction) this.d;
                x16 x16Var = (x16) this.b;
                e89 e89Var = (e89) this.e;
                wef wefVar = wef.a;
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    e89Var.setValue(Boolean.TRUE);
                    String url = redeemPopupAction != null ? redeemPopupAction.getUrl() : null;
                    if (url == null) {
                        url = "";
                    }
                    a26Var.d(url);
                    x16Var.invoke();
                }
                return wefVar;
            case 1:
                x16 x16Var2 = (x16) this.b;
                ynb.V((aw2) this.c, null, null, new j7e(null, (x16) this.e, (ted) this.d), 3);
                x16Var2.invoke();
                return wef.a;
            case 2:
                x16 x16Var3 = (x16) this.b;
                x16 x16Var4 = (x16) this.c;
                e89 e89Var2 = (e89) this.e;
                e89 e89Var3 = (e89) this.d;
                x16Var3.invoke();
                if (((Boolean) e89Var2.getValue()).booleanValue()) {
                    x16Var4.invoke();
                } else {
                    e89Var3.setValue(Boolean.TRUE);
                }
                return wef.a;
            case 3:
                return new t2g((LocalDate) this.c, (LocalDate) this.d, (LocalDate) this.b, (DayOfWeek) this.e, null);
            case 4:
                x16 x16Var5 = (x16) this.b;
                o8b o8bVar = (o8b) this.c;
                x16 x16Var6 = (x16) this.d;
                String str = (String) this.e;
                if (((Boolean) x16Var5.invoke()).booleanValue()) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new alc(str, 15), 2);
                    ((bp3) o8bVar).g(x16Var6);
                }
                return wef.a;
            case 5:
                String str2 = (String) this.c;
                aw2 aw2Var = (aw2) this.d;
                ted tedVar = (ted) this.e;
                x16 x16Var7 = (x16) this.b;
                alc alcVar = new alc("tap_close", 16);
                x1f x1fVar2 = x1f.a;
                x1f.k(p05.a, new b92("close", str2, 2, (Object) null, alcVar, 5), 2);
                ynb.V(aw2Var, null, null, new m4g(null, x16Var7, tedVar), 3);
                return wef.a;
            default:
                sag sagVar = (sag) this.c;
                UUID uuid = (UUID) this.d;
                kr5 kr5Var = (kr5) this.b;
                Context context = (Context) this.e;
                sagVar.getClass();
                String string = uuid.toString();
                lbg lbgVarD = sagVar.c.d(string);
                if (lbgVarD == null || lbgVarD.b.a()) {
                    qc0.p("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    vva vvaVar = sagVar.b;
                    synchronized (vvaVar.k) {
                        try {
                            ff8.h().l(vva.l, "Moving WorkSpec (" + string + ") to the foreground");
                            ccg ccgVar = (ccg) vvaVar.g.remove(string);
                            if (ccgVar != null) {
                                if (vvaVar.a == null) {
                                    PowerManager.WakeLock wakeLockA = ozf.a(vvaVar.b);
                                    vvaVar.a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                vvaVar.f.put(string, ccgVar);
                                vvaVar.b.startForegroundService(hce.c(vvaVar.b, fbc.h(ccgVar.a), kr5Var));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    tag tagVarH = fbc.h(lbgVarD);
                    String str3 = hce.x;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", kr5Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kr5Var.b);
                    intent.putExtra("KEY_NOTIFICATION", kr5Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", tagVarH.a);
                    intent.putExtra("KEY_GENERATION", tagVarH.b);
                    context.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ zlb(int i, x16 x16Var, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = x16Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ zlb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    public /* synthetic */ zlb(String str, aw2 aw2Var, ted tedVar, x16 x16Var) {
        this.a = 5;
        this.c = str;
        this.d = aw2Var;
        this.e = tedVar;
        this.b = x16Var;
    }
}
