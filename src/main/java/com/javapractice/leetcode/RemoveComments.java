package com.javapractice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveComments {
    public List<String> removeComments(String[] source) {
        List<String> lines = new ArrayList<>();
        boolean inBlock = false;
        StringBuilder sb = new StringBuilder();
        for (String line : source) {
            if (inBlock && !line.contains("*/")) {
                continue;
            } else if (inBlock && line.contains("*/") && line.indexOf("*/") == line.length() - 2) {
                if (sb.length() != 0) {
                    lines.add(sb.toString());
                }
                inBlock = false;
            } else if (inBlock && line.contains("*/")) {
                sb.append(line.split("\\*/")[1]);
                lines.add(sb.toString());
                inBlock = false;
            } else if (line.contains("/*") && line.contains("*/") && line.indexOf("/*") == 0 && line.indexOf("*/") == line.length() - 2) {
                continue;
            } else if (line.contains("/*") && line.contains("*/") && line.indexOf("*/") == line.length() - 2) {
                lines.add(line.split("/\\*")[0]);
            } else if (line.contains("/*") && line.contains("*/")) {
                lines.add(line.split("/\\*")[0] + line.split("\\*/")[1]);
            } else if (line.contains("/*")) {
                sb = new StringBuilder();
                sb.append(line.split("/\\*")[0]);
                inBlock = true;
            } else if (line.contains("//")) {
                lines.add(line.split("//")[0]);
            } else {
                lines.add(line);
            }
        }
        return lines;
    }
}
