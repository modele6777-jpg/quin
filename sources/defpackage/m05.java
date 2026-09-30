package defpackage;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.events.model.EventInfo;
import tech.chatmind.api.events.model.EventRequest;
import tech.chatmind.api.events.model.UserPopupEvent;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m05 implements it6, unf, hf8 {
    public final az4 a;

    public m05(az4 az4Var) {
        this.a = az4Var;
    }

    public final EventInfo a(nh7 nh7Var) {
        try {
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            return (EventInfo) xh7Var.a(EventInfo.Companion.serializer(), nh7Var);
        } catch (yyc e) {
            d().g("skip unparseable event: " + e.getMessage());
            return null;
        }
    }

    public final UserPopupEvent b(nh7 nh7Var) {
        try {
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            return (UserPopupEvent) xh7Var.a(UserPopupEvent.Companion.serializer(), nh7Var);
        } catch (DateTimeException e) {
            d().g("skip user popup with invalid timestamp: " + e.getMessage());
            return null;
        } catch (yyc e2) {
            d().g("skip unparseable user popup: " + e2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [pu4] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object c(zn2 zn2Var) throws Throwable {
        i05 i05Var;
        Object arrayList;
        if (zn2Var instanceof i05) {
            i05Var = (i05) zn2Var;
            int i = i05Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                i05Var.label = i - Integer.MIN_VALUE;
            } else {
                i05Var = new i05(this, zn2Var);
            }
        } else {
            i05Var = new i05(this, zn2Var);
        }
        Object objA = i05Var.result;
        int i2 = i05Var.label;
        wef wefVar = wef.a;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                az4 az4Var = this.a;
                EventRequest eventRequest = new EventRequest((String) null, (String) null, false, 7, (rp3) null);
                i05Var.label = 1;
                objA = az4Var.a(eventRequest, i05Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objA);
            }
            NullableServerResponse nullableServerResponse = (NullableServerResponse) objA;
            if (!nullableServerResponse.getSuccess()) {
                d().g("fetchEvents API returned error: " + nullableServerResponse.getErrorMessage());
                return wefVar;
            }
            Object obj = (nh7) nullableServerResponse.getData();
            if (obj instanceof yg7) {
                arrayList = new ArrayList();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    EventInfo eventInfoA = a((nh7) it.next());
                    if (eventInfoA != null) {
                        arrayList.add(eventInfoA);
                    }
                }
            } else if (obj instanceof ti7) {
                Collection collectionValues = ((ti7) obj).a.values();
                arrayList = new ArrayList();
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    EventInfo eventInfoA2 = a((nh7) it2.next());
                    if (eventInfoA2 != null) {
                        arrayList.add(eventInfoA2);
                    }
                }
            } else {
                arrayList = pu4.a;
            }
            hs3 hs3Var = xqa.Y;
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            ynb.V(lw2.a, null, null, new h05(hs3Var.a, xh7Var.d(new dd0(EventInfo.Companion.serializer(), 0), arrayList), null), 3);
            return wefVar;
        } catch (Exception e) {
            ynb.h0(e);
            d().c("request event api error", e);
            return wefVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(zn2 zn2Var) throws Throwable {
        j05 j05Var;
        if (zn2Var instanceof j05) {
            j05Var = (j05) zn2Var;
            int i = j05Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                j05Var.label = i - Integer.MIN_VALUE;
            } else {
                j05Var = new j05(this, zn2Var);
            }
        } else {
            j05Var = new j05(this, zn2Var);
        }
        Object objD = j05Var.result;
        int i2 = j05Var.label;
        knf knfVar = knf.a;
        try {
            if (i2 == 0) {
                jzb.q(objD);
                az4 az4Var = this.a;
                j05Var.label = 1;
                objD = az4Var.d(qu4.a, j05Var);
                bw2 bw2Var = bw2.a;
                if (objD == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objD);
            }
            NullableServerResponse nullableServerResponse = (NullableServerResponse) objD;
            if (!nullableServerResponse.getSuccess()) {
                d().g("user popup API returned error: " + nullableServerResponse.getErrorMessage());
                return knfVar;
            }
            Object obj = (nh7) nullableServerResponse.getData();
            if (obj == null) {
                return new lnf(pu4.a);
            }
            if (!(obj instanceof yg7)) {
                d().g("user popup API returned unexpected data shape");
                return knfVar;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                UserPopupEvent userPopupEventB = b((nh7) it.next());
                if (userPopupEventB != null) {
                    arrayList.add(userPopupEventB);
                }
            }
            return new lnf(arrayList);
        } catch (IllegalArgumentException e) {
            d().c("failed to decode user popup response", e);
            return knfVar;
        } catch (CancellationException e2) {
            throw e2;
        } catch (yyc e3) {
            d().c("failed to decode user popup response", e3);
            return knfVar;
        } catch (Exception e4) {
            ynb.h0(e4);
            d().c("request user popup api error", e4);
            return knfVar;
        }
    }
}
