package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ki7 {
    public static final JsonParser a = new JsonParser();

    public static fi7 a(String str, JsonElement jsonElement) throws ji7 {
        boolean zIsJsonNull = jsonElement.isJsonNull();
        fi7 fi7Var = gi7.a;
        if (zIsJsonNull) {
            return fi7Var;
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isString()) {
                return new mi7(asJsonPrimitive.getAsString());
            }
            if (asJsonPrimitive.isNumber()) {
                return new hi7(asJsonPrimitive.getAsNumber());
            }
            return (asJsonPrimitive.isBoolean() && asJsonPrimitive.getAsBoolean()) ? bi7.b : bi7.c;
        }
        int i = 0;
        if (jsonElement.isJsonArray()) {
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            ArrayList arrayList = new ArrayList(asJsonArray.size());
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(a(String.format("%s[%d]", str, Integer.valueOf(i)), it.next()));
                i++;
            }
            return new ai7(arrayList);
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.keySet().size() != 1) {
            throw new ji7("objects must have exactly 1 key defined, found " + asJsonObject.keySet().size(), str);
        }
        String str2 = asJsonObject.keySet().stream().findAny().get();
        fi7 fi7VarA = a(str + "." + str2, asJsonObject.get(str2));
        ai7 ai7Var = fi7VarA instanceof ai7 ? (ai7) fi7VarA : new ai7(Collections.singletonList(fi7VarA));
        List list = ai7Var.a;
        if (!"var".equals(str2)) {
            return new ii7(str2, ai7Var);
        }
        fi7 fi7Var2 = list.size() > 1 ? ai7Var.get(1) : fi7Var;
        if (list.size() >= 1) {
            fi7Var = ai7Var.get(0);
        }
        return new ni7(fi7Var, fi7Var2);
    }
}
