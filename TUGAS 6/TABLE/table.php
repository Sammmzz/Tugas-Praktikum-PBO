<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Table Perkalian</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h2>Table Perkalian 1 - 10</h2>
    <table border="1">
        <tr>
            <td>Bilangan</td>
            <?php 
                for($i = 1; $i<=10; $i++){
                    echo "<th>$i</th>";
                }
            ?>
        </tr>
            <?php for($i = 1; $i<=10; $i++): ?>
                <tr>
                    <th><?php echo $i ?></th>
                    <?php for($j = 1; $j <= 10; $j++): ?>
                        <?php if(($i % 2 == 1) && ($j % 2 == 1)): ?>
                        <td class="yellow"><?php echo $i * $j ?></td>
                        <?php else: ?>
                            <td class="blue"><?php echo $i * $j ?></td>
                        <?php endif;?>
                    <?php endfor;?>
                </tr>
            <?php endfor;?>
    </table>
</body>
</html>